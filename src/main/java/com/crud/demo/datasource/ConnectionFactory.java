package com.crud.demo.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    
    private static final String URL = "jdbc:postgresql://<HOST>:<PORT>/<DB_NAME>";
    private static final String USER = "<USERNAME>";
    private static final String PASS = "<PASSWORD>";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}