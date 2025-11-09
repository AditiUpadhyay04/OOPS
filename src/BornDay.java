import java.time.LocalDate;
import java.util.Scanner;

    public class BornDay {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your birth day: ");
            int d = sc.nextInt();
            System.out.print("Enter your birth month: ");
            int m = sc.nextInt();
            System.out.print("Enter your birth year: ");
            int y = sc.nextInt();

            LocalDate date = LocalDate.of(y, m, d);
            System.out.println("You were born on a " + date.getDayOfWeek());
        }
    }


