import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeReportBuilder implements IEmployeeReportBuilder {
    private EmployeeReport _employeeReport;
    private List<Employee> _employees;

    public EmployeeReportBuilder(List<Employee> employees) {
        _employees = employees;
        _employeeReport = new EmployeeReport();
    }

    @Override
    public void BuildHeader() {
        Date date = new Date();
        _employeeReport.setHeader("EMPLOYEES REPORT ON DATE: " + date +
                "\n------------------------------------------------------------------------------\n");
    }

    @Override
    public void BuildBody() {
        _employeeReport.setBody(
                _employees.stream()
                        .map(e -> "Employee: " + e.getName() + "\tSalary: " + e.getSalary())
                        .collect(Collectors.joining(System.lineSeparator()))
        );
    }

    @Override
    public void BuildFooter() {
        _employeeReport.setFooter(
                "\n------------------------------------------------------------------------------\n" +
                "TOTAL EMPLOYEES " + _employees.size()
        );
    }

    @Override
    public EmployeeReport GetReport() {
        return _employeeReport;
    }
}
