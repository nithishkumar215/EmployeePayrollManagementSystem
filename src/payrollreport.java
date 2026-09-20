public class PayrollReport {

    public static void display(Employee e) {
        double gross = PayrollCalculator.calculateGross(e);
        double net = PayrollCalculator.calculateNet(e);

        System.out.println("\n--- PAYROLL REPORT ---");
        System.out.println("Employee ID: " + e.id);
        System.out.println("Name: " + e.name);
        System.out.println("Basic Salary: " + e.basicSalary);
        System.out.println("Allowance: " + e.allowance);
        System.out.println("Deduction: " + e.deduction);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary: " + net);
    }
}