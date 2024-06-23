package academy.devdojo.maratonajava.classes.teste;
import academy.devdojo.maratonajava.classes.dominio.Pessoa;

public class Cobaia {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ívano");
        pessoa.setIdade(35);
        pessoa.setSexo('M');

        pessoa.imprime();

        System.out.println(pessoa.getNome());;
    }
}
