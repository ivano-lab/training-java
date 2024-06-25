package academy.devdojo.maratonajava.classes.teste;
import academy.devdojo.maratonajava.classes.dominio.Pessoa;

import java.util.Scanner;

public class pessoaTeclado {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        System.out.println("*** Digite seus dados *** ");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Idade: ");
        int idade = teclado.nextInt();
        System.out.print("Sexo: ");
        char sexo = teclado.next().charAt(0);
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        pessoa.setSexo(sexo);

        pessoa.imprime();
    }
}
