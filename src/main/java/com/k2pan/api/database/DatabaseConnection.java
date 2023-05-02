package com.k2pan.api.database;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection conn;
    private BasicDataSource dataSource;

    private DatabaseConnection() {
        // private constructor
        dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/k2pan");
        dataSource.setUsername("postgres");
        dataSource.setPassword("admin");
        try {
            conn = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
            // initialize the connection here
        }
        return instance;
    }

    public Connection getConnection() {
        return conn;
    }

    public DataSource getDataSource() {
        return dataSource;
    }
}
