package com.exemple.app;

import java.io.Serializable;

public class Course implements Serializable {
    private Student student;

    public Course() {
    }

    public Course(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Course{" +
                "student=" + student +
                '}';
    }
}
