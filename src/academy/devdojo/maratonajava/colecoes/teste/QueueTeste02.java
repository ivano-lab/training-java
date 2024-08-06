package academy.devdojo.maratonajava.colecoes.teste;

import academy.devdojo.maratonajava.colecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5L, "Yu Yu Hakusho", 19.99));
        mangas.add(new Manga(6L, "Naruto", 24.99));
        mangas.add(new Manga(1L, "One Piece", 29.99));
        mangas.add(new Manga(4L, "Attack on Titan", 22.99));
        mangas.add(new Manga(3L, "Fullmetal Alchemist", 18.99));
        mangas.add(new Manga(2L, "Death Note", 21.99));

        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
