package org.javacourse.repository;
import org.javacourse.db.ConnectionPool;
import org.javacourse.dto.BaseDto;
import org.javacourse.dto.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomerRepository extends CrudRepository<Customer> {
    public CustomerRepository(ConnectionPool pool) {
        super(pool);
    }

    public List<Customer> FindAll() {
        List<Customer> result = null;
        try {
            Connection conn = this.pool.getConnection();
            PreparedStatement statement = conn.prepareStatement(
                    "SELECT customer_name, phone_number, ssn FROM CUSTOMER");
            result = super.FindAll(statement);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return result;
    }

    @Override
    protected List<Customer> readResultSet(ResultSet set) throws SQLException{
        List<Customer> result = new ArrayList<>();
        while(set.next()) {
            result.add(new Customer(set.getString(1), set.getString(2), set.getString(3)));
        }

        return result;
    }
}

