package com.apple.developer.exercise02;


import java.util.HashMap;
import java.util.Map;

public class User {

    private static Map<String, String> map = new HashMap<>();
    private String name;
    private String password;

    public static Map getMap() {
        User user01 = new User("2017025333", "02182078");
        map.put(user01.getName(), user01.getPassword());
        return map;
    }

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
