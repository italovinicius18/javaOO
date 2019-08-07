package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n): ");
        String verify = sc.nextLine();

        if (verify.equals("y")){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }
        else{
            account = new Account(number, holder); //inicia a conta com zero
        }


        System.out.println("Account data:");
        System.out.print(account);

        double deposit;
        System.out.print("Enter deposit value: ");
        deposit = sc.nextDouble();
        account.moneyDeposit(deposit);
        System.out.println("Updated account data:");
        System.out.print(account);

        double withdraw;
        System.out.print("Enter withdraw value: ");
        withdraw = sc.nextDouble();
        account.moneyWithdraw(withdraw);
        System.out.println("Updated account data:");
        System.out.print(account);





        sc.close();
    }
}
