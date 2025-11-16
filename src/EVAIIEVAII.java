public class EVAIIEVAII {
    public static void main(String[] args) {

        // Create objects
        Customer customer = new Customer("Aditi");
        ChaiMaker maker = new ChaiMaker("Raju");
        Cup cup = new Cup();
        ChaiShop shop = new ChaiShop(maker);

        // Customer orders chai
        shop.takeOrder(customer, cup);
    }
}

    // ---------------- CUSTOMER ----------------
    class Customer {
        String name;

        public Customer(String name) {
            this.name = name;
        }

        public void drinkChai() {
            System.out.println(name + " is sipping chai like a boss! ");
        }
    }

    // ---------------- CUP ----------------
    class Cup {
        boolean hasChai = false;

        public void fill() {
            hasChai = true;
            System.out.println("Cup is now filled with hot chai! ");
        }
    }

    // ---------------- CHAI MAKER ----------------
    class ChaiMaker {
        String makerName;

        public ChaiMaker(String makerName) {
            this.makerName = makerName;
        }

        public void prepareChai() {
            System.out.println(makerName + " is preparing garma-garam chai... ");
        }
    }

    // ---------------- CHAI SHOP ----------------
    class ChaiShop {
        ChaiMaker maker;

        public ChaiShop(ChaiMaker maker) {
            this.maker = maker;
        }

        public void takeOrder(Customer customer, Cup cup) {
            System.out.println("Order received! Making chai for " + customer.name + "...");
            maker.prepareChai();
            cup.fill();
            customer.drinkChai();
            System.out.println("Chai delivered successfully! ");
        }
    }


