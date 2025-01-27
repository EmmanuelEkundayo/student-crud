package services.impl;

import models.Student;
import services.StudentService;
import services.TeacherService;
import models.*;
public class TeacherServiceImpl implements TeacherService {

    private final StudentService studentService = new StudentServiceImpl();
    public void teachCourse(String course, Teacher teacher) {
        System.out.println(teacher.getName() + " is teaching " + course);
    }

    public void gradeStudent(Student student, String course , int grade, Teacher teacher) {
        studentService.addGrade(course, grade);
        System.out.println(teacher.getName() + " graded " + student.getName() + " in " + course + " with " + grade);
    }
}
