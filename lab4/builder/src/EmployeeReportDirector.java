public class EmployeeReportDirector {
    private IEmployeeReportBuilder _builder;

    public EmployeeReportDirector(IEmployeeReportBuilder builder){
        _builder = builder;
    }

    public void Build(){
        _builder.BuildHeader();
        _builder.BuildBody();
        _builder.BuildFooter();
    }
}
