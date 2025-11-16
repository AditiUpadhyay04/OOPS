package Interface;

public class MAIN {// Main.java

        public static void main(String[] args) {

            CAR c = new CAR("BMW", 200, "Black", 4);
            BIKE b = new BIKE("Honda", 120, "Red", true);
            TRUCK t = new TRUCK("Tata", 80, "Blue", 10);

            System.out.println("\n--- Car Details ---");
            c.showDetails();
            c.carFeature();
            c.start();

            System.out.println("\n--- Bike Details ---");
            b.showDetails();
            b.bikeFeature();
            b.start();

            System.out.println("\n--- Truck Details ---");
            t.showDetails();
            t.truckFeature();
            t.start();
        }
    }


