import models.*;
import services.AdminService;
import services.ClassRoomService;
import services.impl.AdminServiceImpl;
import services.impl.ClassRoomServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Principal principal = new Principal("Principal Adeniyi", 50, 200000);
        Applicant applicant = new Applicant("Timilehin", 17);
        applicant.setEntranceExamScore(81);

        Applicant applicant1 = new Applicant("emma", 18);
        applicant1.setEntranceExamScore(49);

        Applicant applicant2 = new Applicant("junior", 27);
        applicant2.setEntranceExamScore(50);

        Applicant applicant4 = new Applicant("Praise", 30);
        applicant4.setEntranceExamScore(91);

        Applicant applicant5 = new Applicant("Dayo", 19);
        applicant5.setEntranceExamScore(59);

        Applicant applicant6 = new Applicant("Bayo", 29);
        applicant6.setEntranceExamScore(52);

        Applicant applicant7 = new Applicant("Praise", 30);
        applicant7.setEntranceExamScore(91);


        //1.  ADMIT STUDENTS

        AdminService adminService = new AdminServiceImpl();

        adminService.admit(principal, applicant);
        adminService.admit(principal, applicant2);
        adminService.admit(principal, applicant1);
        adminService.admit(principal, applicant4);
        adminService.admit(principal, applicant5);
        adminService.admit(principal, applicant6);
        adminService.admit(principal, applicant7);


        List<Student> allStudents = adminService.getSchoolRegister();

        //2 . ASSIGN STUDENTS TO CLASS
        ClassRoomService classRoomService = new ClassRoomServiceImpl();
        ClassRoom jss1 = new ClassRoom("JSS1");
        allStudents.forEach(student -> classRoomService.addStudentToClass(student, jss1));




    }
}
