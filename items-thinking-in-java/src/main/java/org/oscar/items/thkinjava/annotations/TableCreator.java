package org.oscar.items.thkinjava.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 * Created date: 2014-11-26 19:47
 */
public class TableCreator {
    public static void createTable(Class<?>... classes) {
        for (Class cl : classes) {
            DBTable dbTable = (DBTable) cl.getAnnotation(DBTable.class);
            if (dbTable == null) {
                System.out.println("db table of class : " + cl.getName() + " is required.");
                continue;
            }
            String tableName = dbTable.name();
            //if the table name is empty, use the class name;
            if (tableName.length() < 1) {
                tableName = cl.getSimpleName().toUpperCase();
            }
            List<String> columnDefs = new ArrayList<String>();
            for (Field field : cl.getDeclaredFields()) {
                String columnName;
                Annotation[] annotations = field.getAnnotations();
                if (annotations.length < 1) {
                    continue;
                }
                if (annotations[0] instanceof SQLInteger) {
                    SQLInteger sqlInteger = (SQLInteger) annotations[0];
                    //use field name if name not specified
                    if (sqlInteger.name().length() < 1) {
                        columnName = field.getName().toUpperCase();
                    } else {
                        columnName = sqlInteger.name();
                    }
                    columnDefs.add(columnName + " INT" + getConstraints(sqlInteger.constraints()));
                }

                if (annotations[0] instanceof SQLString) {
                    SQLString sqlString = (SQLString) annotations[0];
                    if (sqlString.name().length() < 1) {
                        columnName = field.getName().toUpperCase();
                    } else {
                        columnName = sqlString.name();
                    }
                    columnDefs.add(columnName + " VARCHAR(" +
                            sqlString.value() + ")" +
                            getConstraints(sqlString.constraints()));
                }
                StringBuilder createCommand = new StringBuilder("CREATE TABLE " + tableName + "(");
                for (String columnDef : columnDefs) {
                    createCommand.append("\n ").append(columnDef).append(",");
                }
                // Remove trailing comma
                String tableCreate = createCommand.substring(
                        0, createCommand.length() - 1) + ");";
                System.out.println("Table Creation SQL for " +
                        cl.getSimpleName() + " is :\n" + tableCreate);
            }
        }
    }

    private static String getConstraints(Constraints con) {
        String constraints = "";
        if (!con.allowNull()) {
            constraints += "NOT NULL";
        }
        if (con.foreignKey()) {
            constraints += "FOREIGN KEY";
        }
        if (con.primaryKey()) {
            constraints += "PRIMARY KEY";
        }
        if (con.unique()) {
            constraints += "UNIQUE";
        }
        return constraints;
    }
}
