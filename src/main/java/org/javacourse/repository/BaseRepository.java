package org.javacourse.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class BaseRepository {
    Connection dealershipServiceConnection = DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/postgres",
            "postgres",
            "velimiro22");

    protected BaseRepository() throws SQLException {
    }
}
