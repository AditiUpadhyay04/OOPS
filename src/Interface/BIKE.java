package Interface;

public class BIKE extends VEHICLE{// Bike.java (Child Class)


    boolean hasDiscBrake;

    public BIKE(String brand, int speed, String color, boolean hasDiscBrake) {
        super(brand, speed, color);
        this.hasDiscBrake = hasDiscBrake;
    }

    public void bikeFeature() {
        System.out.println("Bike disc brake: " + hasDiscBrake);
    }
}



