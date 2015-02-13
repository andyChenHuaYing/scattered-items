package org.springframework.samples.data.access.programmatic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.samples.utils.TransactionSQLUtils;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;

public class PlatformTransactionManagerBeanTest {

    private ApplicationContext context;

    private PlatformTransactionManager platformTransactionManager;

    private DataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext(
                "spring_configuration/data/programmatic/spring-data-access-transaction-management.xml"
        );
        platformTransactionManager = context.getBean(PlatformTransactionManager.class);
        dataSource = context.getBean(DataSource.class);
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Test
    public void testPlatformTransactionManagerForHighLevel() throws Exception {
        DefaultTransactionDefinition definition = new DefaultTransactionDefinition();
        definition.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
        definition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        TransactionStatus transactionStatus = platformTransactionManager.getTransaction(definition);
        jdbcTemplate.execute("CREATE TABLE if not EXISTS test(id int NOT NULL AUTO_INCREMENT, PRIMARY KEY(id),name varchar(15))");
        try {
            jdbcTemplate.update(TransactionSQLUtils.INSERT_SQL, "test");
            platformTransactionManager.commit(transactionStatus);
            Assert.assertEquals(1, jdbcTemplate.queryForList(TransactionSQLUtils.COUNT_SQL).size());
        } catch (DataAccessException e) {
            e.printStackTrace();
            platformTransactionManager.rollback(transactionStatus);
        }
//        jdbcTemplate.execute(TransactionSQLUtils.DROP_TABLE_SQL);
    }

    @Test
    public void testPlatformTransactionManagerForLowLevel() throws Exception {

    }
}