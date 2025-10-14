package Method;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fourth {
      static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(rollNumber());
    }
    public static List<Integer> rollNumber(){
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        return list;

    }

}
