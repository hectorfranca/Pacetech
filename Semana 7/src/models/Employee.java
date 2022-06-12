package src.models;

public class Employee {
    private String firstName;
    private String lastName;
    private float salary;

    public Employee(String firstName, String lastName, float salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.setSalary(salary);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        return this.getFirstName() + " " + this.getLastName();
    }

    public float getSalary() {
        return this.salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(float salary) {
        if (salary < 0) {
            this.salary = 0.0f;
        } else {
            this.salary = salary;
        }
    }

    public float annualSalary() {
        return this.salary * 12;
    }

    public void increaseSalary(float percentage) {
        this.salary = this.salary + (this.salary / percentage);
    }
}
