package services;
import models.*;
import java.util.HashMap;
import java.util.Map;

public interface StudentService {
    public static final Map<String, Integer> grades = new HashMap<>();

    public  void addGrade(String course, int grade);

    public  Map<String, Integer> getGrades();

    public void takeExam(String course, Student student);

}
