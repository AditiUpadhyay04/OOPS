package Abstraction;

public abstract class Parent {
    int age;
    String name;
    final int marks = 99;


    public Parent( int age , String name) {
        this.age = age;
        this.name = name;
    }

    // abstract class me concrete method(ese methods jinki body hoti ho) ho skte hai
    void info(){
        System.out.println("information");
    }
    
    // abstract class ke andr static method ho skte the
    public static void greet(){
        System.out.println("greeting");
    }

    // abstract class ka object create nahi kr skte kyuki jb object create hoga toh uss class ke method bhi call kr skta hai
    // or abstract class ke methid ki body nahi hoti
    abstract void career();
    abstract void marriage();

}
// abstract classes cannot be final
// abstract class ke paas final variable ho skte hai
