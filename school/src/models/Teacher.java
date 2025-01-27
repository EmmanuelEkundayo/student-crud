package models;
import services.impl.StudentServiceImpl;

public class Teacher extends Staff {
    public Teacher(String name, int age, int salary) {
        super(name, age, salary);
    }

//    public void teachCourse(String course) {
//        System.out.println(getName() + " is teaching " + course);
//    }
//
//    public void gradeStudent(Student  student,String course ,StudentServiceImpl StudentServiceimpl, int grade) {
//        StudentServiceimpl.addGrade(course, grade);
//        System.out.println(getName() + " graded " + student.getName() + " in " + course + " with " + grade);
//    }
}
