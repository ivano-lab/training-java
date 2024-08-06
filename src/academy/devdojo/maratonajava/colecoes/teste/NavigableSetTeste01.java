package academy.devdojo.maratonajava.colecoes.teste;

import academy.devdojo.maratonajava.colecoes.dominio.Manga;
import academy.devdojo.maratonajava.colecoes.dominio.Smartphone;

import java.util.*;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone smartphone1, Smartphone smartphone2) {
        return smartphone1.getMarca().compareTo(smartphone2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return Double.compare(manga1.getPreco(), manga2.getPreco());
    }
}

public class NavigableSetTeste01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("124", "nokia");
        set.add(smartphone);
        //System.out.println(set);
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "Yu Yu Hakusho", 19.99));
        mangas.add(new Manga(6L, "Naruto", 24.99));
        mangas.add(new Manga(1L, "One Piece", 29.99));
        mangas.add(new Manga(4L, "Attack on Titan", 22.99));
        mangas.add(new Manga(3L, "Fullmetal Alchemist", 18.99));
        mangas.add(new Manga(2L, "Death Note", 21.99));
        mangas.add(new Manga(32L, "Aaragon", 21.99));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga scried = new Manga(66L, "Scried", 20.6, 5);

        System.out.println("----------------------------");

        System.out.println(mangas.lower(scried));
        System.out.println(mangas.floor(scried));
        System.out.println(mangas.higher(scried));
        System.out.println(mangas.ceiling(scried));


    }
}
