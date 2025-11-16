package Interface;

public class CAR extends VEHICLE{// Car.java (Child Class)


        int doors;

        public CAR(String brand, int speed, String color, int doors) {
            super(brand, speed, color); // calling parent constructor
            this.doors = doors;
        }

        public void carFeature() {
            System.out.println("Car has " + doors + " doors.");
        }
    }


