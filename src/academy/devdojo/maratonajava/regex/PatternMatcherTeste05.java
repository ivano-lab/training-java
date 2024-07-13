package academy.devdojo.maratonajava.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste05 {
    public static void main(String[] args) {
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "Luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.print("Email válido: ");
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.print("Email válido: ");
        System.out.println("zoro@mail.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        System.out.println(texto.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Posições encontradas:");
        while (matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
