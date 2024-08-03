package academy.devdojo.maratonajava.colecoes.teste;

import academy.devdojo.maratonajava.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Yu Yu Hakusho", 19.99, 3));
        mangas.add(new Manga(6L, "Naruto", 24.99, 5));
        mangas.add(new Manga(1L, "One Piece", 29.99, 0));
        mangas.add(new Manga(4L, "Attack on Titan", 22.99, 2));
        mangas.add(new Manga(3L, "Fullmetal Alchemist", 18.99));
        mangas.add(new Manga(2L, "Death Note", 21.99, 0));

        /*Iterator<Manga> mangaIterator = mangas.iterator();
        while(mangaIterator.hasNext()){
            if(mangaIterator.next().getQuantidade() == 0) {
                mangaIterator.remove();
            }
        }*/
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
