package entities;

public class Account {
    private int number;
    private String holder;
    private double amount;


    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        moneyDeposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getAmount() {
        return amount;
    }

    public void moneyDeposit(double deposit) {
        this.amount += deposit;
    }

    public void moneyWithdraw(double withdraw) {
        this.amount -= withdraw + 5;
    }

    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $"
                + String.format("%.2f\n", amount);
    }
}
