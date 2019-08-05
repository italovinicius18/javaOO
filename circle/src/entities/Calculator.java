package entities;

public class Calculator {
    public static double r;
    public static final double PI = 3.14159;

    public static double circumference(double r){
        return PI*r*r;
    }

    public static double volume(double r){
        return (4.0/3)*PI*r*r*r;
    }
}
