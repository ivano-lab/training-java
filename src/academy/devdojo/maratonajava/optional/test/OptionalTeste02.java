package academy.devdojo.maratonajava.optional.test;

import academy.devdojo.maratonajava.optional.dominio.Manga;
import academy.devdojo.maratonajava.optional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTeste02 {
    public static void main(String[] args) {

        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no Hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);

        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Drifters")
                .orElseGet(() -> new Manga(3, "Drifters", 28));

        System.out.println(newManga);
    }
}
