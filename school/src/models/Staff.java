package models;
public class Staff extends Person {
    public int getSalary() {
        this.salary = salary;
        return salary;
    }

    int salary;
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public Staff(String name, int age, int salary) {
        super(name, age);
        this.salary = this.salary;
    }

}
