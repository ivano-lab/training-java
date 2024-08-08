package academy.devdojo.maratonajava.lambdas.teste;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTeste01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Batman", "Superman", "Flash", "Mulher-Maravilha", "Lanterna Verde");
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7);
        forEach(strings, (String s) -> System.out.println(s));
        forEach(integers, (Integer i) -> System.out.println(i) );
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T e: list) {
            consumer.accept(e);
        };
    }
}
