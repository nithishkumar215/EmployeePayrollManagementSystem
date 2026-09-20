import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter Allowance: ");
        double allowance = sc.nextDouble();

        System.out.print("Enter Deduction: ");
        double deduction = sc.nextDouble();

        Employee e = new Employee(
            id, name, basic, allowance, deduction
        );

        PayrollReport.display(e);

        sc.close();
    }
}