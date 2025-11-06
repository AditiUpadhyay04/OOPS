package Abstraction;

public class Daughter extends Parent{

    public Daughter(int age, String name) {
        super(age, name);
    }


    @Override
    void career() {
        System.out.println("I WANT TO BE A DESIGNER");
    }
    @Override
    void marriage(){
        System.out.println("ARRANGED");
       }

}

