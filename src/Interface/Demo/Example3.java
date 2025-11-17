package Interface.Demo;
    public class Example3 {
        public static void main(String[] args) {
            Laptop dell = new Laptop();
            dell.turnOn();
            dell.turnOff();
        }
    }

    // -------- Interface --------
    interface Device {
        void turnOn();
        void turnOff();
    }

    // -------- Implementation Class --------
    class Laptop implements Device {

        @Override
        public void turnOn() {
            System.out.println("Laptop is turning ON...");
        }

        @Override
        public void turnOff() {
            System.out.println("Laptop is turning OFF...");
        }
    }


