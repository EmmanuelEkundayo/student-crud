package models;
public class Principal extends Staff {
    public Principal(String name, int age, int salary) {
        super(name, age, salary);
    }

//    public boolean admitApplicant(Applicant applicant) {
//        if (applicant.getEntranceExamScore() >80) {
//            System.out.println(getName() + " admitted: " + applicant.getName());
//            return applicant.isAccepted();
//        } else {
//            System.out.println(getName() + " rejected: " + applicant.getName());
//            return !applicant.isAccepted();
//        }
//    }
}