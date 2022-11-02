package org.javacourse.db;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

    public class ConnectionPool {
        static final String databaseResourcePath = "src/main/resources/database.properties";

        private HikariDataSource dataSource;

        public ConnectionPool() {
            HikariConfig config = new HikariConfig(databaseResourcePath);

            dataSource = new HikariDataSource(config);
        }

        public Connection getConnection() throws SQLException {
            return dataSource.getConnection();
        }
 }