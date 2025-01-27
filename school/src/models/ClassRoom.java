package models;
import java.util.ArrayList;
import java.util.List;

public class ClassRoom extends Place {
    private List<Student> students;

    public ClassRoom(String name) {
        super(name);
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
