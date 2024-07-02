package academy.devdojo.maratonajava.polimorfismo.teste;

import academy.devdojo.maratonajava.polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.polimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.polimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.polimorfismo.service.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Commodore 64", 25000);
        Tomate tomate = new Tomate("Tomata Assassino", 10);
        Televisao tv = new Televisao("Sansung 50\"", 5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println(computador.printaLinha());
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println(tomate.printaLinha());;
        CalculadoraImposto.calcularImposto(tv);
    }
}
