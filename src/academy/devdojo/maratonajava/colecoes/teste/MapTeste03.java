package academy.devdojo.maratonajava.colecoes.teste;

import academy.devdojo.maratonajava.colecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.colecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTeste03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Ívano");
        Consumidor consumidor2 = new Consumidor("Fazenda Consentini");

        Manga manga1 = new Manga(5L, "Yu Yu Hakusho", 19.99);
        Manga manga2 =new Manga(6L, "Naruto", 24.99);
        Manga manga3 = new Manga(1L, "One Piece", 29.99);
        Manga manga4 = new Manga(4L, "Attack on Titan", 22.99);
        Manga manga5 = new Manga(3L, "Fullmetal Alchemist", 18.99);
        Manga manga6 = new Manga(2L, "Death Note", 21.99);

        List<Manga> mangaConsumidorList1 = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidorList2 = List.of(manga4, manga5, manga6);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaConsumidorList1);
        consumidorMangaMap.put(consumidor2, mangaConsumidorList2);

        for(Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println("Cliente: " + entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("Mangá: " + manga.getNome());
            }
        }
    }
}
