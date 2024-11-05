package com.exemple.app;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int grade;
    private transient String password;

    public Student() {
    }

    public Student(String name, int grade, String password) {
        this.name = name;
        this.grade = grade;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', grade=" + grade + ", password="+password+"}";
    }
}
