package entities;

public class CurrencyConverter {
    public static double convert(double price,double dollars){
        return (dollars*price)+iof(price,dollars);
    }
    public static double iof(double price,double dollars){
        return dollars*price*6/100;
    }

}
