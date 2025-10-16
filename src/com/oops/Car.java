package com.oops;

public class Car {
    String CarName;
    String engine;
    int NumberOfSeats;
    String colour;

    public String getCarName() {

        return CarName;
    }
    public void setCarName(String carName) {

        this.CarName = carName;
    }


    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getNumberOfSeats() {
        return NumberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.NumberOfSeats = numberOfSeats;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    Car(String CarName, String engine, int NumberOfSeats, String colour){
        this.CarName = CarName;
        this.engine = engine;
        this.NumberOfSeats = NumberOfSeats;
        this.colour = colour;


    }
    public void displayDetail(){
        //System.out.println("-------------car details-------------");
        System.out.println("Name of the car : " +CarName);
        System.out.println("engine :" +engine);
        System.out.println("NumberOfSeats :" +NumberOfSeats);
        System.out.println("colour :" +colour);

    }
    public static void main(String[] args) {
        Car c1 = new Car("BMW " , "Petrol", 5, "White");

        Car c2 = new Car( "Thar" ,"Petrol" , 2," Black");

        System.out.println("-------------car details-------------");

        c1.displayDetail();
        System.out.println("--------------------------");
        c2.displayDetail();

    }
}
