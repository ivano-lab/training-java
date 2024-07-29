package academy.devdojo.maratonajava.colecoes.teste;

import academy.devdojo.maratonajava.colecoes.dominio.Smartphone;

public class EqualsTeste01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("IABC1", "iPhone");
        Smartphone s2 = new Smartphone("IABC1", "iPhone");
        System.out.println(s1.equals(s2));
    }
}
