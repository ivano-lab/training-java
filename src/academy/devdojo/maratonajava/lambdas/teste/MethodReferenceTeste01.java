package academy.devdojo.maratonajava.lambdas.teste;

import academy.devdojo.maratonajava.lambdas.dominio.Anime;
import academy.devdojo.maratonajava.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTeste01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 5000), new Anime("One Piece", 1000), new Anime("Naruto", 500)));
        //Collections.sort(animeList, (a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
        //Collections.sort(animeList, AnimeComparators::compareByTitle);
        Collections.sort(animeList, AnimeComparators::compareByEpisodes);
        animeList.sort(AnimeComparators::compareByTitle);
        System.out.println(animeList);
    }
}
