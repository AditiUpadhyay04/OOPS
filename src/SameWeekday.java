import java.time.LocalDate;

    public class SameWeekday {
        public static void main(String[] args) {
            LocalDate date1 = LocalDate.of(2024, 11, 9);
            LocalDate date2 = LocalDate.of(2025, 11, 9);

            if (date1.getDayOfWeek() == date2.getDayOfWeek())
                System.out.println("Both dates fall on the same weekday: " + date1.getDayOfWeek());
            else
                System.out.println("They fall on different weekdays.");
        }
    }


