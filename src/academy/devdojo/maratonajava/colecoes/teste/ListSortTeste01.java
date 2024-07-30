package academy.devdojo.maratonajava.colecoes.teste;

import academy.devdojo.maratonajava.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTeste01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList(6);
        mangas.add("Yu Yu Hakusho");
        mangas.add("Naruto");
        mangas.add("One Piece");
        mangas.add("Attack on Titan");
        mangas.add("Fullmetal Alchemist");
        mangas.add("Death Note");

        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        for(String manga : mangas) {
            System.out.println(manga);
        }

        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);

    }
}
