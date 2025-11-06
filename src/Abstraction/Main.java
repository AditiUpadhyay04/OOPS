package Abstraction;

public class Main {
    public static void main(String[] args) {
        Son s1 = new Son(12,"Rohan");
        s1.career();
        s1.marriage();
        System.out.println(s1.age);
        System.out.println(s1.name);

        Daughter d1 = new Daughter(10, "Tanya");
        d1.career();
        d1.marriage();
        System.out.println(d1.age);
        System.out.println(d1.name);

        Parent p1 = new Daughter(13,"Tanu");
        System.out.println(p1.age);
        System.out.println(p1.name);

    }
}
