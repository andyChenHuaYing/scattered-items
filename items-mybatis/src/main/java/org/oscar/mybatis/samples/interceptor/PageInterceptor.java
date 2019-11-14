package org.oscar.mybatis.samples.interceptor;

import org.oscar.mybatis.samples.entity.Page;
import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import java.util.Properties;

/**
 * Page interceptor.
 * Support oracle and mysql.
 * Created by andy on 5/25/2015.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class})})
public class PageInterceptor implements Interceptor {

    private String dialect;

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        MetaObject metaObject = MetaObject.forObject(statementHandler, SystemMetaObject.DEFAULT_OBJECT_FACTORY,
                SystemMetaObject.DEFAULT_OBJECT_WRAPPER_FACTORY);
        MappedStatement mappedStatement = (MappedStatement) metaObject.getValue("delegate.mappedStatement");
        String sqlId = mappedStatement.getId();

        //intercept select sql witch end with "ByPage".
        if (sqlId.matches(".+ByPage$")) {
            BoundSql boundSql = (BoundSql) metaObject.getValue("delegate.boundSql");
            String sql = boundSql.getSql();
            ParameterHandler parameterHandler = (ParameterHandler) metaObject.getValue("delegate.parameterHandler");
            Map<?, ?> paramMap = (Map<?, ?>) parameterHandler.getParameterObject();
            Page page = (Page) paramMap.get("page");
            //set count
            Connection connection = (Connection) invocation.getArgs()[0];
            String countSql = "select count(1) from (" + sql + ") a";
            PreparedStatement preparedStatement = connection.prepareStatement(countSql);
            parameterHandler.setParameters(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                page.setTotalNumber(resultSet.getInt(1));
            }
            //construct record limit sql by dialect
            String pageSql;
            if ("oracle".equals(dialect.toLowerCase())) {
                pageSql = "select * from " +
                        "(select a.*, rownum rn from (" + sql + ") a where rownum >= " + page.getRowNum() + ") " +
                        "rn < " + page.getRn();
            } else if ("mysql".equals(dialect.toLowerCase())) {
                pageSql = sql + " limit " + page.getDbIndex() + "," + page.getDbNumber();
            } else {
                pageSql = sql;
            }
            metaObject.setValue("delegate.boundSql.sql", pageSql);

        }
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
        this.dialect = properties.getProperty("dialect");
    }
}
