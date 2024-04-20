package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Map<String, Student> students = new HashMap<>();
        students.put("Juan", new Student("Juan", 85));
        students.put("Maria", new Student("Maria", 70));
        students.put("Carlos", new Student("Carlos", 95));
        students.put("Lucia", new Student("Lucia", 60));

        Student student = new Student();

        Map<String, Student> updatedStudents = student.increaseGrades(students);
        for (Map.Entry<String, Student> entry : updatedStudents.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Calificación: " + entry.getValue().getGrade());
        }
    }
}
