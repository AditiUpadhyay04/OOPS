package Interface;

public class VEHICLE {// Vehicle.java (Parent Class)

        String brand;
        int speed;
        String color;

        public VEHICLE(String brand, int speed, String color) {
            this.brand = brand;
            this.speed = speed;
            this.color = color;
        }

        public void start() {
            System.out.println(brand + " is starting...");
        }

        public void stop() {
            System.out.println(brand + " is stopping...");
        }

        public void showDetails() {
            System.out.println("Brand: " + brand);
            System.out.println("Speed: " + speed + " km/h");
            System.out.println("Color: " + color);
        }
    }


