package org.javacourse.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class BaseDto {
    private int id;

    public PreparedStatement getCreateStatement(Connection conn) throws SQLException {
        return null;
    }

    public PreparedStatement getFindAllStatement(Connection conn) throws SQLException {
        return null;
    }

    public void readResultSet(ResultSet set) {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


}
