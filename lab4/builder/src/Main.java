import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("name1", 111));
        employees.add(new Employee("name2", 222));
        employees.add(new Employee("name3", 333));

        var builder = new EmployeeReportBuilder(employees);
        var director = new EmployeeReportDirector(builder);

        director.Build();

        var report = builder.GetReport();

        System.out.println(report);
    }
}