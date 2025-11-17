package Interface;

public class Example {
    public static void main(String[] args) {
        OnlinePayment payment = new OnlinePayment();
        payment.payByCard();
        payment.payByUPI();
        payment.payByWallet();
    }
}

    // ------------ Interfaces ----------------
    interface CardPayment {
        void payByCard();
    }

    interface UPIPayment {
        void payByUPI();
    }

    interface WalletPayment {
        void payByWallet();
    }

    // ------------ Implementation Class ------------
    class OnlinePayment implements CardPayment, UPIPayment, WalletPayment {

        @Override
        public void payByCard() {
            System.out.println("Payment done using Card.");
        }

        @Override
        public void payByUPI() {
            System.out.println("Payment done using UPI.");
        }

        @Override
        public void payByWallet() {
            System.out.println("Payment done using Wallet.");
        }
    }


