package dateAndTime.localDate;

import java.time.LocalDate;

public class LocalDateExample2 {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2019, 1, 1);
        System.out.println(date1.isLeapYear());

        LocalDate date2 = LocalDate.of(2024, 1, 2);
        System.out.println(date2.isLeapYear());
    }
}
