package academy.devdojo.maratonajava.datas;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationTeste01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterYears = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7hours = LocalTime.now().minusHours(7);
        Duration d1 = Duration.between(now, nowAfterYears);
        Duration d2 = Duration.between(timeNow, timeMinus7hours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().minusSeconds(1000));
        Duration d4 = Duration.ofDays(20);
        Duration d5 = Duration.ofMinutes(3);
        Duration d6 = Duration.of(3, ChronoUnit.HOURS);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
    }
}
