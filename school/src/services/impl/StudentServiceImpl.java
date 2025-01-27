package services.impl;

import models.Person;
import models.Student;
import services.StudentService;
import java.util.HashMap;
import java.util.Map;

public class StudentServiceImpl implements StudentService {
    public static final Map<String, Integer> grades = new HashMap<>();
    public void addGrade(String course, int grade) {
        grades.put(course, grade);
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    @Override
    public void takeExam(String course, Student student) {
        System.out.println(student.getName() + " is writing exam for: " + course);
    }

}
