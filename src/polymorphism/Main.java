package polymorphism;

public class Main {
    public static void main(String[] args) {
        compileTime c1 = new compileTime();

        System.out.println(c1.sum(34,423));
        System.out.println(c1.sum(34.43,937));

    }
}
