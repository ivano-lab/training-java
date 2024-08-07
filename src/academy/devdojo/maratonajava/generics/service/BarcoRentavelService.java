package academy.devdojo.maratonajava.generics.service;

import academy.devdojo.maratonajava.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));

    public Barco buscandoBarcoDisponivel() {
        System.out.println("Buscando Barco disponível...");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando Barco: " + barco);
        System.out.println("Barcos disponíveis para alugar:");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornandoBarcoAlugado(Barco barco) {
        System.out.println("Devolvendo barco " + barco);
        barcosDisponiveis.add(barco);
        System.out.println("Barcos disponíveis para alugar:");
        System.out.println(barcosDisponiveis);
    }
}
