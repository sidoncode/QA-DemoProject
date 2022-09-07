package com.example.DemoProject.Model;

public class Boss {

    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // creating a empty constructor
    public Boss(){}

    // creating a parameterized Constructor
    public Boss(int id, String name,int age){
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }


}
