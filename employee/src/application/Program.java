package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.printf("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.printf("Employee: %s\n",employee);

        System.out.print("Which percentage to increase salary: ");
        double percentage = sc.nextDouble();

        employee.increaseSalary(percentage);


        System.out.printf("Updated data: %s",employee);
        sc.close();
    }
}
