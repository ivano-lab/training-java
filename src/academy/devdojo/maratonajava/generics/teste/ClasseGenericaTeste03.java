package academy.devdojo.maratonajava.generics.teste;

import academy.devdojo.maratonajava.generics.dominio.Barco;
import academy.devdojo.maratonajava.generics.dominio.Carro;
import academy.devdojo.maratonajava.generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTeste03 {
    public static void main(String[] args) {
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscandoObjetoDisponivel();
        System.out.println("Usando o carro por um mês...");
        rentalServiceCarro.retornandoObjetoAlugado(carro);

        System.out.println("----------------------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscandoObjetoDisponivel();
        System.out.println("Usando o barco por um mês...");
        rentalServiceBarco.retornandoObjetoAlugado(barco);
    }
}
