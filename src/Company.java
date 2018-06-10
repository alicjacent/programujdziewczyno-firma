public class Company {

    private Employee employee1;
    private Employee employee2;
    private String companyName;

    public Company(Employee employee1, Employee employee2, String companyName) {
        this.employee1 = employee1;
        this.employee2 = employee2;
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Company{" +
                "employee1=" + employee1 +
                ", employee2=" + employee2 +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
