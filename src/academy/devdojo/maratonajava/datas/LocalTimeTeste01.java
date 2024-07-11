package academy.devdojo.maratonajava.datas;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTeste01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 32, 12);
        System.out.println(time);
        LocalTime timenow = LocalTime.now();
        System.out.println(timenow);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.AMPM_OF_DAY));
        System.out.println(time.get(ChronoField.HOUR_OF_DAY));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
