package dateAndTime.temporalAdjusters;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterExample {

    public static void main(String[] args) {

        TemporalAdjusterExample gfg = new TemporalAdjusterExample();
        gfg.testAdjusters();
    }

    public void testAdjusters() {

        // to get the current date
        LocalDate date1 = LocalDate.now();
        System.out.println("Today's date is: " + date1);

        // to get the next monday
        LocalDate nextTuesday = date1.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println("Next Monday is on : " + nextTuesday);

        // to get the second saturday of next month
        LocalDate firstInYear = LocalDate.of(date1.getYear(), date1.getMonth(), 1);

        LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.next(DayOfWeek.SATURDAY))
                .with(TemporalAdjusters.next(DayOfWeek.SUNDAY));

        // print date of second Saturday of next month
        System.out.println("Second Saturday is on : " + secondSaturday);
    }
}
