package academy.devdojo.maratonajava.dates.teste;

import java.util.Date;

public class DateTeste01 {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000_000L);
        System.out.println(date);
        System.out.println(date.getTime());
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
