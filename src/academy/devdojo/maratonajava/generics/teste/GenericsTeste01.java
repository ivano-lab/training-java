package academy.devdojo.maratonajava.generics.teste;

import academy.devdojo.maratonajava.colecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTeste01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList();
        lista.add("Wolverine");
        lista.add("123L");
        lista.add("Deadpool");

        for (String str : lista) {
            System.out.println(str);
        }
        add(lista, new Consumidor("Bloodsport"));

        for (Object o : lista) {
            System.out.println(o);
        }
    }

    private static void add(List lista, Consumidor consumidor) {
        lista.add(consumidor);
    }
}
