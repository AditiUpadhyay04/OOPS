package Abstraction;

public abstract class Parent {
    int age;
    String name;
    public Parent( int age , String name) {
        this.age = age;
        this.name = name;
    }

    // abstract class ka object create nahi kr skte kyuki jb object create hoga toh uss class ke method bhi call kr skta hai
    // or abstract class ke methid ki body nahi hoti
    abstract void career();
    abstract void marriage();

}
