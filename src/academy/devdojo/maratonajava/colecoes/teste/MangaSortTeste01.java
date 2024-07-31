package academy.devdojo.maratonajava.colecoes.teste;

import academy.devdojo.maratonajava.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList(6);
        mangas.add(new Manga(5L, "Yu Yu Hakusho", 19.99));
        mangas.add(new Manga(6L, "Naruto", 24.99));
        mangas.add(new Manga(1L, "One Piece", 29.99));
        mangas.add(new Manga(4L, "Attack on Titan", 22.99));
        mangas.add(new Manga(3L, "Fullmetal Alchemist", 18.99));
        mangas.add(new Manga(2L, "Death Note", 21.99));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("-----------------");
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
