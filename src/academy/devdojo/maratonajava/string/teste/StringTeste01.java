package academy.devdojo.maratonajava.string.teste;

public class StringTeste01 {
    public static void main(String[] args) {
        String nome = "William"; // pool de string
        String nome2 = "William";
        nome = nome.concat(" Suane");
        System.out.println(nome);
        System.out.println(nome2);
        System.out.println(nome == nome2);
        String nome3 = new String("William"); // Variável de referência, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
