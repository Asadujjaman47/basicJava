package dateAndTime.localTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample5 {

    public static void main(String[] args) {

        ZoneId zone1 = ZoneId.of("Asia/Dhaka");
        ZoneId zone2 = ZoneId.of("Asia/Shanghai");
        LocalTime time1 = LocalTime.now(zone1);
        System.out.println("Bangladesh Time Zone: " + time1);

        LocalTime time2 = LocalTime.now(zone2);
        System.out.println("China Time Zone: " + time2);

        long hours = ChronoUnit.HOURS.between(time1, time2);
        System.out.println("Hours between two Tim Zone: " + hours);

        long minutes = ChronoUnit.MINUTES.between(time1, time2);
        System.out.println("Minutes between two Tim Zone: " + minutes);
    }
}
