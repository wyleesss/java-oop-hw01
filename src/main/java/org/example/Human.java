package org.example;

import java.util.Date;

public class Human {
    private String fullName;
    private Date birthDate;
    private String phoneNumber;
    private String address;

    public Human(String fullName, Date birthDate, String phoneNumber, String address) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("[Human]%nFull Name: %s%nBirth Date: %s%nPhone Number: %s%nAddress: %s",
                fullName, birthDate, phoneNumber, address);
    }
}
