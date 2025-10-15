
import java.util.Arrays;
import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] array1 = new int[3][2];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                array1[i][j] = sc.nextInt();
            }
        }
        for(int[] a : array1){
            System.out.println(Arrays.toString(a));
        }
        for(int[] arr : array){
            System.out.println(Arrays.toString(arr));
        }
    }
}
