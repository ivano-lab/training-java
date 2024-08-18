package academy.devdojo.maratonajava.lambdas.teste;

import academy.devdojo.maratonajava.lambdas.dominio.Anime;
import academy.devdojo.maratonajava.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTeste02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 5000), new Anime("One Piece", 1000), new Anime("Naruto", 500)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}
