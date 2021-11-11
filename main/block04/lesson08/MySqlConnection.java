package main.block04.lesson08;

import org.springframework.stereotype.Component;

import java.sql.*;

@Component("myConnection")
public class MySqlConnection {

    public Connection getMysqlConnection() {
        String url = "jdbc:mysql://localhost:6033/db"; // Имя управляемой базы данны
        String user = "123"; // Имя пользователя базы данных
        String password = "123"; // Пароль
        return getConnection(url, user, password);
    }

    public Connection getConnection(String urlDB, String userName, String userPass) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(urlDB, userName, userPass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void closeConnection(ResultSet resultSet, PreparedStatement preparedStatement, Connection connection) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}