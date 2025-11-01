package polymorphism.RunTime;

public class Main1 {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.area();

        Triangle t1 = new Triangle();
        Circle c1 = new Circle();
        Square s2 = new Square();
        t1.area();
        c1.area();
        s2.area();
        Shape s3 = new Square();
        s3.area();
    }
}
