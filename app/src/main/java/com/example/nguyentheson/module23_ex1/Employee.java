package com.example.nguyentheson.module23_ex1;

public class Employee {
    private String id, name;
    private boolean gender;

    public Employee(String id, String name, boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public Employee() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
