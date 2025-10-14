import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListOfAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        System.out.println("Enter the number of list :");

        int n = sc.nextInt(); // n is the number of sub Arraylist in the outer arraylist

        // initialization
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        System.out.println(list);


        // for input
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number of items you want to print :");
            int m = sc.nextInt(); // m is the size of the arraylist
            for (int j = 0; j < m; j++) {
                list.get(i).add(sc.nextInt());
            }
        }


            // output
            for (int i = 0; i < n; i++) {
                System.out.println(list.get(i) + " ");
            }
            System.out.println();
            System.out.println(list);
        }
    }

