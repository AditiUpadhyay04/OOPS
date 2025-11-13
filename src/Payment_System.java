abstract class Payment {
    abstract void pay(int amount);
}

class UPI extends Payment {
    void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class Card extends Payment {
    void pay(int amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}

public class Payment_System {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new Card();

        p1.pay(500);
        p2.pay(1000);
    }
}
