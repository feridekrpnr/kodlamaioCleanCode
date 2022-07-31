package entities.concretes;

public class Employee extends  Person{
    double salary;

    public Employee() {
    }

    public Employee(int id, String firstName, double salary) {
        super(id, firstName);
        this.salary = salary;
    }
}
