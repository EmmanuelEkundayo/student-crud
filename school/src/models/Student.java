package models;
import services.StudentService;
import services.impl.StudentServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class Student extends Person {

    private String matricNumber;
    public Student(String name, int age, String matricNumber) {
        super(name, age);
        this.matricNumber = matricNumber;
    }

//    public void addGrade(String course, int grade) {
//        grades.put(course, grade);
//    }
//
//    public Map<String, Integer> getGrades() {
//        return grades;
//    }
//
//    public void takeExam(String course) {
//        System.out.println(getName() + " is writing exam for: " + course);
//    }
//
//    public String getMatricNumber() {
//        return matricNumber;
//    }


    @Override
    public String toString() {
        return "Student{" +
                "matricNumber='" + matricNumber + '\'' +
                ", grades=" + StudentService.grades +
                '}';
    }
}
