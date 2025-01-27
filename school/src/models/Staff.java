package models;
public class Staff extends Person {
    public int getSalary() {
        return salary;
    }

    int salary;
    public void setSalary(int salary) {
    }
    public Staff(String name, int age, int salary) {
        super(name, age);
    }

}
