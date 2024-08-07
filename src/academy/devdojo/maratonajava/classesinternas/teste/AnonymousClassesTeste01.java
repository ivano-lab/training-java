package academy.devdojo.maratonajava.classesinternas.teste;

import academy.devdojo.maratonajava.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Animal {
    public void walk(){
        System.out.println("Animal walking...");
    }
}

class BarcoNameComparator implements Comparator<Barco> {

    @Override
    public int compare(Barco barco1, Barco barco2) {
        return barco1.getNome().compareTo(barco2.getNome());
    }
}

class Dog extends Animal {
    @Override
    public void walk() {
        System.out.println("Dog walking...");
    }
}
public class AnonymousClassesTeste01 {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void walk() {
                System.out.println("Walking in The Sun...");
            }
        };
        animal.walk();
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Canoa"), new Barco("Lancha")));;
        barcoList.sort(new Comparator<Barco>() {

            @Override
            public int compare(Barco barco1, Barco barco2) {
                return barco1.getNome().compareTo(barco2.getNome());
            }
        });
        System.out.println(barcoList);
    }
}
