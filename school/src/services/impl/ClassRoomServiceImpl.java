package services.impl;

import models.ClassRoom;
import models.Student;
import services.ClassRoomService;
import java.util.List;

public class ClassRoomServiceImpl implements ClassRoomService {

    @Override
    public void addStudentToClass(Student student, ClassRoom classRoom) {

        if (classRoom.getStudents().size() < 5) { // Classroom capacity limit
           List<Student> classMembers = classRoom.getStudents();
           classMembers.add(student);
           classRoom.setStudents(classMembers);
            System.out.println(student.getName() + " has joined the classroom.");
        } else {
            System.out.println("Classroom "+classRoom.getName() +"is full, " + student.getName() + " cannot join.");
        }
    }

}

