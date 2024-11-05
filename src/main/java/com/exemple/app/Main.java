package com.exemple.app;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String studentFile ="student.ser";
        String courseFile ="course.ser";
        String listFile ="studentsList.ser";
        SerializeService serializeService = new SerializeService();
        Student student = new Student("John Doe", 90, "secret");
        Course course = new Course(student);
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alco Born", 88, "1234"));
        students.add(new Student("Bob Mob", 92, "1234"));

//#1
//        Створіть клас Student з полями name і grade. Серіалізуйте об'єкт цього класу у файл student.ser.
//        Десеріалізуйте об'єкт Student з файлу student.ser і виведіть його на екран.
//        Додайте поле password до класу Student, зробіть його transient і переконайтеся, що це поле не серіалізується.
        serializeService.serializedObject(student,studentFile);
        serializeService.deserializedObject(new Student(),studentFile);
//#2
//        Створіть клас Course з полем Student і серіалізуйте об'єкт Course.
        serializeService.serializedObject(course,courseFile);
        serializeService.deserializedObject(new Course(),courseFile);
//        #3
//        Серіалізуйте список об'єктів Student.
        serializeService.serializedObject(students,listFile);
        System.out.println("list");
        serializeService.deserializedObject(new ArrayList<Student>(),listFile);
    }
}
