package academy.devdojo.maratonajava.generics.teste;

import academy.devdojo.maratonajava.generics.dominio.Barco;
import academy.devdojo.maratonajava.generics.dominio.Carro;
import academy.devdojo.maratonajava.service.CarroRentavelService;
import academy.devdojo.maratonajava.service.BarcoRentavelService;


public class ClasseGenericaTeste01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscandoCarroDisponivel();
        System.out.println("Usando o carro por um mês...");
        carroRentavelService.retornandoCarroAlugado(carro);
        System.out.println("----------------------------");
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscandoBarcoDisponivel();
        System.out.println("Usando o barco por um mês...");
        barcoRentavelService.retornandoBarcoAlugado(barco);
    }
}
