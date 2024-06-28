package academy.devdojo.maratonajava.modificadorfinal.teste;

import academy.devdojo.maratonajava.modificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.modificadorfinal.dominio.Ferrari;

public class TestDrive {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Capitão Bumerangue");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari1 = new Ferrari();
        ferrari1.setNome("Enzo");
        ferrari1.imprime();
    }
}
