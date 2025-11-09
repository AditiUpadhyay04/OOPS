import java.time.DayOfWeek;
import java.time.LocalDate;

    public class SundayInAYear {
        public static void main(String[] args) {
            int year = 2005;
            int sundayCount = 0;

            for (int month = 1; month <= 12; month++) {
                LocalDate date = LocalDate.of(year, month, 1);
                while (date.getMonthValue() == month) {
                    if (date.getDayOfWeek() == DayOfWeek.SUNDAY)
                        sundayCount++;
                    date = date.plusDays(1);
                }
            }

            System.out.println(year + " has " + sundayCount + " Sundays.");
            if (sundayCount == 53)
                System.out.println("This year has 53 Sundays!");
            else
                System.out.println("This year has 52 Sundays.");
        }
    }


