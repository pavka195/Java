package main.block04.lesson05;

import java.sql.*;

public class Solution {
    public static final String TABLE = "test666";
    private static final QueryTables queryTables = new QueryTables();
    private static final MySqlConnection mySqlConnection = new MySqlConnection();
    private static final String SQL_QUERY_TABLES = "select e.emp_id, e.emp_name, e.salary, d.name from employee e\n" +
            "left join department d on e.department_id = d.id";
    private static final String SQL_CREATE_TABLES = "create table " + TABLE + " (id int primary key, name varchar(200));";
    private static final String SQL_INSERT_TABLES = "insert into " + TABLE + " (id, name) values (?, ?);";
    private static final String SQL_UPDATE_TABLES = "update " + TABLE + " set name = 'XXXX6' where id = 7;";
    private static final String SQL_CLEAR_TABLES = "truncate " + TABLE + ";";
    private static final String SQL_DELETE_TABLES = "drop table " + TABLE + ";";

    public static void main(String[] args) throws SQLException {
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
