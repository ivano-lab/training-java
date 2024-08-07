package academy.devdojo.maratonajava.generics.teste;

import academy.devdojo.maratonajava.generics.dominio.Barco;

import java.util.List;

public class MetodosGenericosTeste01 {
    public static void main(String[] args) {
        //List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Barco1"));
        //System.out.println(barcoList);
    }

    private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto(T t){
        return List.of();
    }
}

