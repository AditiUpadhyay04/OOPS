package Interface;

public class TRUCK extends VEHICLE {// Truck.java (Child Class)


        int loadCapacity;

        public TRUCK(String brand, int speed, String color, int loadCapacity) {
            super(brand, speed, color);
            this.loadCapacity = loadCapacity;
        }

        public void truckFeature() {
            System.out.println("Truck load capacity: " + loadCapacity + " tons");
        }
    }


