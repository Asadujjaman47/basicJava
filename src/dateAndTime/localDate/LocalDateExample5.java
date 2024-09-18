package dateAndTime.localDate;

import java.time.LocalDate;

public class LocalDateExample5 {

    public static void main(String[] args) {

        String dInStr = "2011-09-01";
        LocalDate d1 = LocalDate.parse(dInStr);
        System.out.println("String to LocalDate: " + d1);

        String dInStr2 = "2015-11-20";
        LocalDate d2 = LocalDate.parse(dInStr);
        System.out.println("String to LocalDate: " + d2);
    }
}
