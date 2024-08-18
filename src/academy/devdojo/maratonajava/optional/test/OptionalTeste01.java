package academy.devdojo.maratonajava.optional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTeste01 {
    public static void main(String[] args) {
        Optional<String> opt1 = Optional.of("Grandes Poderes, grandes responsabilidades!");
        Optional<String> opt2 = Optional.ofNullable(null);
        Optional<String> opt3 = Optional.empty();
        System.out.println(opt1);
        System.out.println(opt2);
        System.out.println(opt3);

        System.out.println("-------------------------");

        Optional <String> nameOptional = Optional.ofNullable(findName("Ívano"));
        String empty = nameOptional.orElse("EMPTY");
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
        System.out.println(empty);
        System.out.println(nameOptional);
    }

    private static String findName(String name){
        List<String> list = List.of("Ívano", "eittie");
        int i = list.indexOf(name);
        if (i != 1) {
            return list.get(i);
        }
        return null;
    }
}
