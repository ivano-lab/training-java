package academy.devdojo.maratonajava.polimorfismo.teste;

import academy.devdojo.maratonajava.polimorfismo.service.RepositorioBanco;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        RepositorioBanco repositorio = new RepositorioBanco();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Wolverine");
        list.add("Ciclope");
        list.add("Deadpool");
        System.out.println(list);
    }
}
