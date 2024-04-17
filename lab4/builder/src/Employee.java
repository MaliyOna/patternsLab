import java.text.DecimalFormat;

public class Employee {
    private String name;
    private double salary;

    public Employee(String newName, double newSalary) {
        name = newName;
        salary = newSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
