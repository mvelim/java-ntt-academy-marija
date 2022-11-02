package org.javacourse.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Customer extends BaseDto {
    private String name;
    private String phoneNumber;
    private String ssn;

    public Customer(String name, String phoneNumber, String ssn) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.ssn = ssn;
    }
    public Customer(int id, String name, String phoneNumber, String ssn) {
        this(name, phoneNumber, ssn);
        super.setId(id);
    }
    @Override
    public PreparedStatement getCreateStatement(Connection conn) throws SQLException {
        PreparedStatement statement = conn.prepareStatement(
                "INSERT INTO CUSTOMER(customer_name, phone_number, ssn) VALUES (?, ?, ?)");
        statement.setString(1, this.name);
        statement.setString(2, this.phoneNumber);
        statement.setString(3, this.ssn);
        return statement;
    }
    @Override
    public PreparedStatement getFindAllStatement(Connection conn) throws SQLException {
        PreparedStatement statement = conn.prepareStatement("SELECT * FROM CUSTOMER");
        return statement;
    }
    @Override
    public String toString() {
        return ("id: " + getId()
                + "Name: " + name
                + "Phone Number: " + phoneNumber
                + "SSN: " + ssn);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
