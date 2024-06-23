package academy.devdojo.maratonajava.classes.teste;

import academy.devdojo.maratonajava.classes.dominio.Seriado;

public class netflix {
    public static void main(String[] args) {
        Seriado seriado = new Seriado("One Piece");
        System.out.println(seriado.getEpisodios());

        for (int episodio : seriado.getEpisodios()) {
            System.out.println(episodio + " ");
        }

    }
}
