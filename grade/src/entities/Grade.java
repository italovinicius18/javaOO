package entities;

public class Grade {
    public String name;
    public double n1;
    public double n2;
    public double n3;

    public double finalgrade(){
        return n1+n2+n3;
    }

    public String situation(){
        if (finalgrade()>=60) {
            return "PASS";
        }

        else{
            return missingpoints();
        }

    }

    public String missingpoints(){
        double missing = 60-finalgrade();
        return "FAILED"
               +String.format("\nMISSING %.2f points",missing);
    }
}
