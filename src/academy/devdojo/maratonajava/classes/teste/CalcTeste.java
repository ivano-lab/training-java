package academy.devdojo.maratonajava.classes.teste;

import academy.devdojo.maratonajava.classes.dominio.Calculadora;

public class CalcTeste {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1, 2, 3, 4, 5, 6};

        calculadora.somaArray(numeros);
        calculadora.somaArray(1, 2, 3, 4, 5, 6, 20);
    }
}
