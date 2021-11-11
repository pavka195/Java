package main.block04.lesson08;

import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import main.block04.lesson08.config.ApplicationConfiguration;

import java.sql.Connection;
import java.sql.SQLException;

public class Solution {
    public static final String TABLE = "test666";
    private static final String SQL_QUERY_TABLES = "select e.emp_id, e.emp_name, e.salary, d.name from employee e\n" +
            "left join department d on e.department_id = d.id";
    private static final String SQL_CREATE_TABLES = "create table " + TABLE + " (id int primary key, name varchar(200));";
    private static final String SQL_INSERT_TABLES = "insert into " + TABLE + " (id, name) values (?, ?);";
    private static final String SQL_UPDATE_TABLES = "update " + TABLE + " set name = 'XXXX6' where id = 7;";
    private static final String SQL_CLEAR_TABLES = "truncate " + TABLE + ";";
    private static final String SQL_DELETE_TABLES = "drop table " + TABLE + ";";

    public static void main(String[] args) throws SQLException {
        SpringRunnerAbstractApplicationContext();
        System.out.println("-------------------------------------------" + "\n");
        SpringRunnerClassPathXmlApplicationContext();
    }

    static void SpringRunnerAbstractApplicationContext(){
        final AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        System.out.println("Используем AnnotationConfigApplicationContext" + "\n");
        SpringRunnerWork(context);
    }
    public static void SpringRunnerClassPathXmlApplicationContext(){
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Используем ClassPathXmlApplicationContext" + "\n");
        SpringRunnerWork(context);
    }

    private static void SpringRunnerWork(@NotNull AbstractApplicationContext context) {
        final MySqlConnection mySqlConnection = context.getBean("myConnection", MySqlConnection.class);
        final QueryTables queryTables = context.getBean("myQuery", QueryTables.class);
        // Подключаемся
        Connection connection = mySqlConnection.getMysqlConnection();
        // Запрос к подготовленным таблицам
        queryTables.queryTables(connection, SQL_QUERY_TABLES);
        // Создание таблицы
        queryTables.createTables(connection, SQL_CREATE_TABLES);
        // наполним данными
        queryTables.insertTables(connection, SQL_INSERT_TABLES);
        // изменим данные
        queryTables.updateTables(connection, SQL_UPDATE_TABLES);
        // очистим таблицу
        queryTables.clearTables(connection, SQL_CLEAR_TABLES);
        // удалим таблицу
        queryTables.deleteTables(connection, SQL_DELETE_TABLES);
        //Закрываемся
        mySqlConnection.closeConnection(QueryTables.getResultSet(), QueryTables.getPreparedStatement(), connection);
    }
}
