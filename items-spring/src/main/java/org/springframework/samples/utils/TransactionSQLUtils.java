package org.springframework.samples.utils;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/13.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class TransactionSQLUtils {
    //id自增主键从0开始
    public static final String CREATE_TABLE_SQL = "CREATE TABLE if not EXISTS test(id int NOT NULL AUTO_INCREMENT, PRIMARY KEY(id),name varchar(15))";
    public static final String DROP_TABLE_SQL = "drop table test";
    public static final String INSERT_SQL = "insert into test(name) values(?)";
    public static final String COUNT_SQL = "select count(*) from test";

}
