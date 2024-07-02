package academy.devdojo.maratonajava.polimorfismo.teste;

import academy.devdojo.maratonajava.polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.polimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.polimorfismo.service.CalculadoraImposto;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 2000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2024");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
