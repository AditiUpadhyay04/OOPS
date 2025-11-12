class BankAccount {
        private String name;
        private double balance;

        public BankAccount(String name, double balance) {
            this.name = name;
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            if (amount <= balance)
                balance -= amount;
            else
                System.out.println("Insufficient balance!");
        }

        public double getBalance() {
            return balance;
        }

        public void display() {
            System.out.println("Account Holder: " + name);
            System.out.println("Balance: ₹" + balance);
        }
    }

    public class Banking {
        public static void main(String[] args) {
            BankAccount acc = new BankAccount("Aditi", 2000);
            acc.deposit(1000);
            acc.withdraw(500);
            acc.display();
        }
    }


