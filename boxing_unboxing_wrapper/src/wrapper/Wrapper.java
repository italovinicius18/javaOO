package wrapper;

public class Wrapper {
    public static void main(String[] args) {
        //wrapper classes tem o objetivo de tratar os tips primitivos como classes de uma forma transparente para o compilador
        //Usado majoritariamente em classes, que possuem valor nulo,
        int x = 20;

        Integer obj = x;

        int y = obj;

        System.out.println(y);
    }
}
