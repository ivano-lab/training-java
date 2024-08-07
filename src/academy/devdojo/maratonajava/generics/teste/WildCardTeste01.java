package academy.devdojo.maratonajava.generics.teste;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando doguinho!");
    }
}


class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando gatinho!");
    }
}


public class WildCardTeste01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        Animal[] animals = {new Cachorro(), new Gato()};
        printConsulta(cachorros);
        printConsulta(gatos);
        printConsulta(animals);

    }
    private static void printConsulta(Animal[] animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
        //animals[1] = new Gato();
    }
}
