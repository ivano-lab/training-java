package academy.devdojo.maratonajava.classes.teste;

import academy.devdojo.maratonajava.classes.dominio.Carro;

public class Seminovo {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);
        System.out.println(Carro.velLim);
        Carro.velLim = 180;
        System.out.println(Carro.velLim);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
