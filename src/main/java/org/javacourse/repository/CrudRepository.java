package org.javacourse.repository;

import org.javacourse.db.ConnectionPool;
import org.javacourse.dto.BaseDto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public abstract class CrudRepository<T extends BaseDto> {
    protected ConnectionPool pool;

    protected CrudRepository(ConnectionPool pool) {
        this.pool = pool;
    }

    public void Create(T obj) {
        try {
            Connection conn = this.pool.getConnection();
            PreparedStatement statement = obj.getCreateStatement(conn);
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<T> FindAll(PreparedStatement statement) {
        try {
            ResultSet set = statement.executeQuery();
            return readResultSet(set);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    protected List<T> readResultSet(ResultSet set) throws SQLException{
        return new ArrayList<>();
    }

}
