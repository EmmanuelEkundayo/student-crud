package services;

import models.Student;
import models.Teacher;
import services.impl.StudentServiceImpl;

public interface TeacherService {
    public void teachCourse(String course, Teacher teacher);

    public void gradeStudent(Student student, String course , int grade, Teacher teacher);

}
