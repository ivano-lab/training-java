package academy.devdojo.maratonajava.string.teste;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat("DevDojo");
        nome = nome.substring(0, 3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
