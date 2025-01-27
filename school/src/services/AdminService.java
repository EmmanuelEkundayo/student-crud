package services;

import models.*;

import java.util.List;

public interface AdminService {

    void admit(Principal principal, Applicant applicant);

    List<Student> getSchoolRegister();

    void expelStudent(Principal principal, Student student, StudentService Studentservice);

    void payStaffSalary (SupportStaff bursar, Teacher teacher, SupportStaff OtherStaff);
    
//    void employStaff()



}
