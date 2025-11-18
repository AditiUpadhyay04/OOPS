package Interface.Demo;

public class InterfaceExample4 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.area();
    }
}

// -------- Interface --------
interface Shape {
    void area();
}

// -------- Implementation Class --------
class Circle implements Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of circle: " + result);
    }
}
