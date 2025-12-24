class BankAccount1 {
        private double balance;

        // Deposit
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        // Withdraw
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }

        // Getter
        public double getBalance() {
            return balance;
        }
    }
    public class DataHiding {
        public static void main(String[] args) {
            BankAccount1 acc = new BankAccount1();
            acc.deposit(5000);
            acc.withdraw(1500);

            System.out.println("Balance: " + acc.getBalance());
        }
    }


