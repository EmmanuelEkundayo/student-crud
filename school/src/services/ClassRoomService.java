package services;

import models.ClassRoom;
import models.Student;
import java.util.List;

public interface ClassRoomService {
    public void addStudentToClass(Student student, ClassRoom classRoom);

}
