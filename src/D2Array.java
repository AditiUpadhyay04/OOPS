import java.util.Arrays;
public class D2Array {
    public static void main(String[] args) {
        int arr[][] = new int[2][2];
        arr[0][0] = 23;
        arr[0][1] = 21;
        arr[1][0] = 378;
        arr[1][1] = 282;

        int[][] arr1 = {
                {8327, 83, 383, 383, 37893},
                {665, 65, 51, 5321, 585},
                {486, 566, 564, 487, 8798},
                {748, 876, 9865, 45, 345},

        };
        int[][] arr2 = new int[][]{{73, 35, 363}, {54, 66, 58, 52}, {36, 14, 78}, {78, 95, 15}};
     

        for(int i =0 ;i<arr2.length;i++)
        {
            //System.out.println(Arrays.toString(arr2[i]));
            System.out.println(Arrays.toString(arr1[i]));
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = 2;
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
        }
    }
}
