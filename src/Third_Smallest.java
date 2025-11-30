public class Third_Smallest {
    public static void main(String[] args) {
        int[] arr = {12, 5, 18, 3, 15, 9};

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < first) {
                third = second;
                second = first;
                first = num;
            } else if (num < second && num != first) {
                third = second;
                second = num;
            } else if (num < third && num != second && num != first) {
                third = num;
            }
        }

        System.out.println("Third Smallest Number: " + third);
    }
}


