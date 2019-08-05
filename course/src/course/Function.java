package course;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a,b,c);

        showResult(higher);

        sc.close();
    }

    public static int max(int a, int b,int c){
        int aux;
        if(a>b && a>c){
            aux = a;
        }
        else if(b>c){
            aux = b;
        }
        else{
            aux = c;
        }
        return aux;

    }

    public static void showResult(int higher){ //void é quando uma função faz apenas uma ação
        System.out.println("Higher = "+higher);
    }

}
