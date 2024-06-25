package academy.devdojo.maratonajava.classes.teste;

import academy.devdojo.maratonajava.classes.dominio.Jogador;
import academy.devdojo.maratonajava.classes.dominio.Time;

public class jogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Félix");
        Jogador jogador2 = new Jogador("Brito");
        Time time = new Time("Seleção Brasileira");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("---------- Time -----------");
        time.imprime();
        System.out.println("---------- Jogador -----------");
        jogador1.imprime();
    }
}
