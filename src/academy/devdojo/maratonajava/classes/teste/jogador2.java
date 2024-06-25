package academy.devdojo.maratonajava.classes.teste;

import academy.devdojo.maratonajava.classes.dominio.Jogador;
import academy.devdojo.maratonajava.classes.dominio.Time;

public class jogador2 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Santos");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
