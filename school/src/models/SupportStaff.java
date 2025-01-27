package models;
import services.SupportStaffService;
public class SupportStaff extends Staff {

    public SupportStaff(String name, int age, int salary) {
        super(name, age, salary);
    }

    public void setSalary(int salary) {
        this.salary = 150000;
    }
    public void maintain(String facility) {
        System.out.println(getName() + " is maintaining " + facility);
    }

//    public void maintainFacility(String facility, int type) {
//        switch (type) {
//            case 1:
//                System.out.println(getName() + " is cleaning " + facility);
//                break;
//            case 2:
//                System.out.println(getName() + " is attending to parents at " + facility);
//                break;
//            case 3:
//                System.out.println(getName() + " is guarding " + facility);
//                break;
//            default:
//                System.out.println("Invalid staff role for maintaining facility.");
//        }
//    }
    /*public static void main(String[] args) {
        SupportStaff staff = new SupportStaff("John Doe", 35);
        staff.setSalary(150_000);
        System.out.println("Salary: " + staff.getSalary());
        staff.maintainFacility("Main Hall", 1);
    }*/
}