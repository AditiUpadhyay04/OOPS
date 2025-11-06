package Abstraction;

public class Son extends Parent{
    public Son(int age, String name) {
        super(age, name);
    }

    @Override
    void career() {
        System.out.println("I WANT TO BE A MUSICIAN");
    }
    @Override
    void marriage(){
        System.out.println("ARRANGED ");
    }



}
