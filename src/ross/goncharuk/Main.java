package ross.goncharuk;

public class Main {
    public static void main(String[] args) {

        Employee.setNumberOfEmployees(3);

        Employee Ross = new Employee("Ross","Goncharuk","Java Developer",0321235312);
        Employee Valera = new Employee("Valera","Valerkin","Plumber",94275321);

        System.out.println(Employee.getNumberOfEmployees());
    }
}