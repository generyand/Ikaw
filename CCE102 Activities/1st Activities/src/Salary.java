import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        /*
         14. Write a java program to calculate a person’s salary. The rate per hour  is Php 35.00. Allow the user to enter the number of hours worked. Any hours worked in excess to 8 hours is paid at the rate of 1.5 times the normal hourly rate. Calculate and display the normal pay, overtime pay and the total  salary of the person.
         */

        Scanner scan = new Scanner(System.in);
        double hourlyRate = 35.00;
        double hoursWorked = 0;
        double overtime = 0;
        double overtimePay = 0;
        double normalPay = 0;
        double totalSalary = 0;

        System.out.print("Enter hours worked: ");
        hoursWorked = scan.nextDouble();
        scan.close();

        if (hoursWorked > 8) {
            normalPay = hourlyRate * 8;
            overtime = hoursWorked - 8;
            overtimePay = overtime * (hourlyRate * 1.5);
            totalSalary = normalPay + overtimePay;
            
        } else {
            normalPay = hourlyRate * hoursWorked;
            totalSalary = normalPay + overtimePay;
        }

        System.out.printf("Normal pay: %.2f php\n", normalPay);
        System.out.printf("Overtime pay: %.2f php\n", overtimePay);
        System.out.printf("Total Salary: %.2f php\n", totalSalary);

    }
}
