package Method;

import java.util.Scanner;

public class First {
    public void summation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a : ");
        int a = sc.nextInt();
        System.out.println("enter value of b : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);

    }
    public static void main(String[] args) {

        First f1 = new First();
        f1.summation();


    }
}
