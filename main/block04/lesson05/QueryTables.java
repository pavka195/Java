package main.block04.lesson05;

import lombok.NonNull;

import java.sql.*;

public class QueryTables {
    private static PreparedStatement preparedStatement = null;
    private static ResultSet resultSet = null;

    public static PreparedStatement getPreparedStatement() {
        return preparedStatement;
    }

    public static ResultSet getResultSet() {
        return resultSet;
    }

    void queryTables(@NonNull Connection connection, String sql) {
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.printf("ID: %d Name: %s Salary: %f DepartmentName: %s%n",
                        resultSet.getInt("emp_id"),
                        resultSet.getString("emp_name"),
                        resultSet.getBigDecimal("salary"),
                        resultSet.getString("name"));
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }

    void createTables(@NonNull Connection connection, String sql) {
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            DatabaseMetaData meta = connection.getMetaData();
            resultSet = meta.getTables(null, null, Solution.TABLE, null);
            while (resultSet.next()) {
                System.out.println("В базе создана таблица: " + resultSet.getString("TABLE_NAME"));
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }

    void insertTables(@NonNull Connection connection, String sql) {
        try {
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < 10; i++) {
                // Заполняем параметры запроса
                preparedStatement.setInt(1, i);
                preparedStatement.setString(2, "Test" + i);
                preparedStatement.execute();
            }
            preparedStatement = connection.prepareStatement("SELECT * FROM " + Solution.TABLE);
            resultSet = preparedStatement.executeQuery();
            System.out.println("В таблицу внесены данные:");
            while (resultSet.next()) {
                System.out.printf("ID: %d Name: %s %n",
                        resultSet.getInt("id"),
                        resultSet.getString("name"));
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }

    void updateTables(@NonNull Connection connection, String sql) {
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("SELECT * FROM " + Solution.TABLE);
            resultSet = preparedStatement.executeQuery();
            System.out.println("В таблице изменены данные:");
            while (resultSet.next()) {
                System.out.printf("ID: %d Name: %s %n",
                        resultSet.getInt("id"),
                        resultSet.getString("name"));
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }

    void clearTables(@NonNull Connection connection, String sql) {
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("select count(*) from  " + Solution.TABLE);
            resultSet = preparedStatement.executeQuery();
            int count = 0;
            while (resultSet.next()) {
                count = resultSet.getInt(1);
            }
            if (count == 0) {
                System.out.println("В таблице: " + Solution.TABLE + " - " + count + " записей, Таблица " + Solution.TABLE + " очищена.");
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }

    void deleteTables(@NonNull Connection connection, String sql) {
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("SELECT * FROM " + Solution.TABLE);
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException sqlEx) {
            System.out.println("Таблица " + Solution.TABLE + " удалена.");
        }
    }
}
