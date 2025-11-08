package Encapsulation;
    class Account {
        private int accNo;
        private String name;
        private float balance;

        // Getter and Setter methods
        public int getAccNo() {
            return accNo;
        }
        public void setAccNo(int accNo) {
            this.accNo = accNo;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public float getBalance() {
            return balance;
        }
        public void setBalance(float balance) {
            this.balance = balance;
        }
    }

    public class Example {
        public static void main(String[] args) {
            Account a1 = new Account();
            a1.setAccNo(12345);
            a1.setName("Aditi");
            a1.setBalance(50000f);

            System.out.println("Account No: " + a1.getAccNo());
            System.out.println("Name: " + a1.getName());
            System.out.println("Balance: " + a1.getBalance());
        }
    }


