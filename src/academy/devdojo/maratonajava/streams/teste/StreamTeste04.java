package academy.devdojo.maratonajava.streams.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTeste04 {
    public static void main(String[] args) {
        List<List> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildnei", "Catarina", "Sandy");
        List<String> developers = List.of("William", "David", "Harrison");
        List<String> students = List.of("Édipo", "Gustavo", "Gugu", "Guilherme");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }

        System.out.println("------------------");
        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
