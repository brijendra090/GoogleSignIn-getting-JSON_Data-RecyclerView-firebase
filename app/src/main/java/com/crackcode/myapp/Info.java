package com.crackcode.myapp;

public class Info {
    private int id;
    private String name, email;

    public Info(){
    }

    public Info(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
