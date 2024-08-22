package academy.devdojo.maratonajava.streams.teste;

import academy.devdojo.maratonajava.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTeste06 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 18.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game, No Life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kuma Desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9));
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() < 8));
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice).reversed())
                .ifPresent(System.out::println);
    }
}
