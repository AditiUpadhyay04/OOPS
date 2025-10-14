package Method;

import java.util.Scanner;

public class Second {

    public void Product(){
        Scanner sc = new Scanner(System.in);
        System.out.println("value1: ");
        int value1 = sc.nextInt();
        System.out.println("value2: ");
        int value2 = sc.nextInt();
        int product = value1 * value2;
        System.out.println(product);
    }
    public static void main(String[] args) {
        Second s1 = new Second();
        s1.Product();


    }
}
