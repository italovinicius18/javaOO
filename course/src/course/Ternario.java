package course;

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        double desconto = (price<20) ? price*0.1 : price*0.05; //operação ternária primeiro: true segundo: false

        System.out.println(desconto);

        sc.close();
    }
}
