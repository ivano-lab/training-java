package academy.devdojo.maratonajava.classesAbstratas.teste;

import academy.devdojo.maratonajava.classesAbstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.classesAbstratas.dominio.Gerente;

public class Funca {
    public static void main(String[] args) {
       Gerente gerente = new Gerente("Nami", 6000);
       Desenvolvedor desenvolvedor = new Desenvolvedor("Fabio Akita", 12000);
       System.out.println(gerente);
       System.out.println(desenvolvedor);
       gerente.imprime();
       desenvolvedor.imprime();
    }
}
