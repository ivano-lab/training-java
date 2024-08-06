package academy.devdojo.maratonajava.colecoes.teste;

import academy.devdojo.maratonajava.colecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTeste02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Ívano");
        Consumidor consumidor2 = new Consumidor("Fazenda Consentini");

        Manga manga1 = new Manga(5L, "Yu Yu Hakusho", 19.99);
        Manga manga2 =new Manga(6L, "Naruto", 24.99);
        Manga manga3 = new Manga(1L, "One Piece", 29.99);
        Manga manga4 = new Manga(4L, "Attack on Titan", 22.99);
        Manga manga5 = new Manga(3L, "Fullmetal Alchemist", 18.99);
        Manga manga6 = new Manga(2L, "Death Note", 21.99);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);
        for(Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println("Cliente: " + entry.getKey().getNome() + " - Mangá: " + entry.getValue().getNome());
        }
    }
}
