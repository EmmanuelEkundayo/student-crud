package services;

import models.ClassRoom;
import models.Student;
public interface ClassRoomService {
    public void addStudentToClass(Student student, ClassRoom classRoom);

}
