package md.pentalog.tasks_part1.chapter3.Ex11;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;

        if(balance > 0.0)
        this.balance = balance;
    }

    public void deposit(double depositAmount){
        if(depositAmount > 0.0){
            balance += depositAmount;
        }
    }

    public void withdraw(double withdrawalAmount){
        if(withdrawalAmount <= balance){
            balance -= withdrawalAmount;
        }else{
            System.out.println("Withdrawal amount exceeded account balance\n");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
