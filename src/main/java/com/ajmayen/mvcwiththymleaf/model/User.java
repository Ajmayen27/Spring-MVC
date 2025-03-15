package com.ajmayen.mvcwiththymleaf.model;

public class User {

    private  String name;
    private String age;
    private String mail;

    public User() {
    }

    public User(String name, String mail, String age) {
        this.name = name;
        this.mail = mail;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
