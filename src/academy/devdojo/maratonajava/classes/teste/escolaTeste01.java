package academy.devdojo.maratonajava.classes.teste;

import academy.devdojo.maratonajava.classes.dominio.Escola;
import academy.devdojo.maratonajava.classes.dominio.Professor;

public class escolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Girafales");
        Professor professor2 = new Professor("Madruguinha");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Escola da Vila", professores);

        escola.imprime();
    }
}
