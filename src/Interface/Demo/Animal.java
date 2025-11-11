package Interface.Demo;

public interface Animal {

    final int a = 16;
    public abstract void eat();
    void sleep();
    static void greet(){
        System.out.println("static method");
    }
    default void greeting(){
        this.eat();
        System.out.println("Animal Interface");
    }
}
// interface has "public abstract method" by default
// interface has final variable by default
// interface(by default public abstract) has abstract method, default method, static method, final variables
// and an abstract classes has instance variable, constructor, static method, normal(concrete method)
