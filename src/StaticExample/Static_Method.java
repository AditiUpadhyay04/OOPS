package StaticExample;

public class Static_Method {

    public static void main(String[] args) {

        Static_Method.Greet();
        Static_Method obj1 = new Static_Method();
        obj1.Greeting();

    }

    static void Greet(){
        System.out.println(" from static method ");
    }
    void Greeting(){
        System.out.println(" from non static ");
    }
    void fun(){
        Greeting();
    }
    void fun2(){
        Greet();
    }
}
