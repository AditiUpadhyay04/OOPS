package Interface.Demo;

public class Example2 {
    public static void main(String[] args) {
        HPPrinter hp = new HPPrinter();
        hp.printDocument();
        hp.scanDocument();
    }
}

    // -------- Interface --------
    interface Printer {
        void printDocument();
        void scanDocument();
    }

    // -------- Class implementing the Interface --------
    class HPPrinter implements Printer {

        @Override
        public void printDocument() {
            System.out.println("Printing document...");
        }

        @Override
        public void scanDocument() {
            System.out.println("Scanning document...");
        }
    }


