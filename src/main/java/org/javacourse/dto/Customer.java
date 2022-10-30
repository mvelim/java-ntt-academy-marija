package org.javacourse.dto;

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
    public String toString() {
        return ("id: " + getId() + "Name: " + name + "Phone Number: " + phoneNumber + "SSN: " + ssn);
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
