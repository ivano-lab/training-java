package academy.devdojo.maratonajava.regex;

import org.w3c.dom.ls.LSOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste02 {
    public static void main(String[] args) {
        //String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
        String texto = "abaaba";
        String texto2 = "12 0x 0X 0xFFABC 0x189 0X1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: " + texto2);
        System.out.println("Índice: 123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas:");
        while (matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
        int numHex = 0x1DFA;
        System.out.println(numHex);
    }
}
