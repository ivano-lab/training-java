package academy.devdojo.maratonajava.classes.dominio;

import java.util.Scanner;

public class LeituraTeclado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.print("Digite seu sexo [m/f]: ");
        char sexo = entrada.next().charAt(0);
        System.out.println("-----------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }
}
