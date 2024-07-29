package academy.devdojo.maratonajava.colecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTeste01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Ívano");
        nomes.add("DevDojo CT");
        nomes2.add("Fontes");
        nomes2.add("Velocitah");
        //System.out.println(nomes.remove("123"));;

        nomes.addAll(nomes2);
        for(String nome: nomes) {
            System.out.println(nome);
        }
        //nomes.add("Fontes");
        System.out.println("-------------");
        for(int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
