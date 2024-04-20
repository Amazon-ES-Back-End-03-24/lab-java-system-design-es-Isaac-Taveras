package org.example;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int grade;

    Map<String, Student> studentMap = new HashMap<>();

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be in the range 0-100");
        }
        this.grade = grade;
    }

    public Map<String, Student> increaseGrades(Map<String, Student> students){
        for (Student student : students.values()){
            int increasedGrade = (int) Math.round(student.getGrade()*1.10);
            student.setGrade(Math.min(increasedGrade, 100));
        }
        return students;
    }
}
