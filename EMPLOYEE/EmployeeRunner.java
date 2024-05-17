public class EmployeeRunner {
    public static void main(String[] args) {
        Employee Neil = new Employee(40000.0);
        Neil.increase(2000.0);
        double p = Neil.getPay();
        System.out.println("Salary is " + p);

        Neil.increase(-500.0);
        p = Neil.getPay();
        System.out.println("Salary is " + p);

        Neil.increase(3000.0);
        p = Neil.getPay();
        System.out.println("Salary is " + p);
    }
}
