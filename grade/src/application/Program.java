package application;

import entities.Grade;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Grade grade = new Grade();

        grade.name = sc.nextLine();
        grade.n1 = sc.nextDouble();
        grade.n2 = sc.nextDouble();
        grade.n3 = sc.nextDouble();

        System.out.println(grade.name);
        System.out.printf("FINAL GRADE = %.2f\n",grade.finalgrade());
        System.out.println(grade.situation());

        sc.close();
    }
}
