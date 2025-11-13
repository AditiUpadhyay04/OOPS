class ATM {
    private int balance;

    public ATM(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if(amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class ATM_Bal {
    public static void main(String[] args) {
        ATM a = new ATM(1000);
        a.deposit(500);
        a.withdraw(300);
        System.out.println("Current Balance: " + a.getBalance());
    }
}
