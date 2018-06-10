public class Main {

    public static void main(String[] args) {

        Employee employeeAnn = new Employee("Ann", "Frank", 40);
        Employee employeeMark = new Employee("Mark", "Balo", 37);

        Company myCompany = new Company(employeeAnn, employeeMark, "The Best Company Ever");

        //dane pierwszego pracownika
        System.out.println("first employee data -> " + employeeAnn.toString());
        //imie drugiego
        System.out.println("name of second employee: " + employeeMark.getName() + " " + employeeMark.getSurname());
        //dane firmy
        System.out.println("company details: " + myCompany.toString());

        //zmiana nazwy firmy
        myCompany.setCompanyName("new company name");
        //wyswietlenie nazwy firmy
        System.out.println("company name after change: " + myCompany.getCompanyName());

    }
}
