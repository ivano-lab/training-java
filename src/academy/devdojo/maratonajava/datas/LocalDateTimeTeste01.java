package academy.devdojo.maratonajava.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTeste01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate date = LocalDate.parse("2024-08-06");
        LocalTime time = LocalTime.parse("09:45:21");
        System.out.println(date);
        System.out.println(time);
        LocalDateTime ldt1 = date.atTime(time);
        System.out.println(ldt1);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt2);
    }
}
