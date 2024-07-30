package academy.devdojo.maratonajava.colecoes.teste;

import academy.devdojo.maratonajava.colecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTeste01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("IABC2", "Samsung");
        Smartphone s2 = new Smartphone("IABC3", "Google Pixel");
        Smartphone s3 = new Smartphone("IABC4", "OnePlus");
        Smartphone s4 = new Smartphone("IABC5", "Huawei");
        Smartphone s5 = new Smartphone("IABC6", "Sony Xperia");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
        smartphones.add(s4);
        smartphones.add(0, s5);
        for(Smartphone smartphone: smartphones) {
            System.out.println(smartphone);
        }
        Smartphone s6 = new Smartphone("IABC6", "Sony Xperia");

        System.out.println(smartphones.contains(s6));
        int indexSmartphone6 = smartphones.indexOf(s6);
        System.out.println(indexSmartphone6);
        System.out.println(smartphones.get(indexSmartphone6));
    }
}
