package com.example.cont;

public class Contact {

    private long id;
    private String name;
    private String phoneNumber;

    public Contact(long id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public Contact( String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public Contact() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String newName) {
        this.name=newName;
    }
    public void setPhoneNumber(String PhoneNumber) {
        this.phoneNumber=PhoneNumber;
    }
}
