package com.example.spring.domain;

public class User {
	private String lastname;
    private String firstname;
    private String id;
    private int age;
    public User(){
        lastname="No last name";
        firstname = "No first name";
        age = -1;
        id = "Unknown";
    }

    public User(String id, String lastname, String firstname, int age) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastname() {

        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
