package org.javacourse.db;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

    public class ConnectionPool {

        private static HikariConfig config = new HikariConfig("database.properties");
        private static HikariDataSource dataSource;

    static {
        dataSource = new HikariDataSource(config);
    }
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
 }