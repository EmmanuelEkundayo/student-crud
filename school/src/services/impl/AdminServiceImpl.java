package services.impl;

import models.*;
import services.AdminService;
import services.StudentService;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

public class AdminServiceImpl implements AdminService {

    public static final List<Student> students = new ArrayList<>();


    /**
     * This method handles the logic of accepting a student into a school <br>
     * It is performed only by a principal and a new applicant is placed
     * @param principal this is the school principal
     * @param applicant this is the incoming student
     */
    @Override
    public void admit(Principal principal, Applicant applicant) {
        System.err.println("===== ADMISSION IN PROGRESS FOR APPLICANT WITH NAME === "+applicant.getName());
        System.err.println();
        validateAndAdmitApplicant(applicant);
        System.err.println("===== END OF ADMISSION FOR APPLICANT === "+applicant.getName());
        System.err.println();

    }

    @Override
    public List<Student> getSchoolRegister() {
        System.err.println("LIST OF STUDENTS IN THE SCHOOL ... ");
        students.forEach(System.err::println);
        return students;
    }


    private void validateAndAdmitApplicant(Applicant applicant) {

        String name = applicant.getName();
        int age = applicant.getAge();
        int entranceScore =  applicant.getEntranceExamScore();

        if (name == null || name.isEmpty()){
            System.err.println("VALID APPLICANT NAME IS REQUIRED");
            return;

        }
        if (age < 18 ){
            System.err.println("ELIGIBLE APPLICANTS MUST BE 18 OR ABOVE ...");
            return;

        }

        if (entranceScore < 50){
            System.err.println(String.format("YOU HAVE FAILED THE EXAM, YOUR SCORE IS %s AND CUT OFF IS %s,  BETTER LUCK NEXT TIME",entranceScore, "50"));
            return;

        }

        System.err.println("CONGRATS "+name+ "YOU HAVE BEEN SUCCESSFULLY ADMITTED ");
        Student newStudent = new Student(name, age, "REG/".concat(LocalDateTime.now().toInstant(ZoneOffset.UTC).toString()));

        students.add(newStudent);

        System.err.println(students.size() + "student(s) has been admitted in the school");



    }


    @Override
    public void expelStudent(Principal principal, Student student, StudentServiceImpl StudentServiceimpl) {
        if (StudentServiceimpl.getGrades().get("English") < 80 && StudentServiceimpl.getGrades().get("Math") < 80) {
                    System.out.println(student.getName() + " was expelled for failing both Math and English.");
                } else if (StudentServiceimpl.getGrades().get("English") < 80) {
                   System.out.println(student.getName() + " was expelled for failing English.");
               } else if (StudentServiceimpl.getGrades().get("Math") < 80) {
                    System.out.println(student.getName() + " was expelled for failing Math.");
                }
                else{
                    System.out.println("STUDENT PASSED BOTH CLASSES");
                }
    }

    @Override
    public void payStaffSalary(SupportStaff bursar, Teacher teacher, SupportStaff OtherStaff) {
        //paying a normal staff
        System.out.println(bursar.getName() +" pays "+ teacher.getName() +" "+ teacher.getSalary() );
        System.out.println(bursar.getName() +" pays "+ OtherStaff.getName() +" "+teacher.getSalary() );

    }
}
