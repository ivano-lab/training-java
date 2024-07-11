package academy.devdojo.maratonajava.formatacao.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTeste01 {
    public static void main(String[] args) {
        String pattern = "'Amsterdã' dd 'de' MMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("Amsterdã 9 de julho de 2024"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
