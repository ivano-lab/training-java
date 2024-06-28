package academy.devdojo.maratonajava.classes.teste;

import academy.devdojo.maratonajava.classes.dominio.Endereco;
import academy.devdojo.maratonajava.classes.dominio.Funcionario;
import academy.devdojo.maratonajava.classes.dominio.Humano;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("8765678-566");
        Humano humano = new Humano("Marty McFly");
        humano.setCpf("437.582.640-14");
        humano.setEndereco(endereco);
        humano.imprime();

        System.out.println("=====================");

        Funcionario funcionario = new Funcionario("Homer Simpson");
        funcionario.setCpf("134.448.130-23");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);
        funcionario.imprime();
    }
}
