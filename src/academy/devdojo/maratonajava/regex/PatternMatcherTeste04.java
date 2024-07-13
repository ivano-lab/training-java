package academy.devdojo.maratonajava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste04 {
    public static void main(String[] args) {
        //String regex = "[a-zA-C]";
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " + texto);
        System.out.println("Índice: 123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas:");
        while (matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
