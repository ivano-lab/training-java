package academy.devdojo.maratonajava.classes.teste;

import academy.devdojo.maratonajava.classes.dominio.Funca;

public class funcionario {
    public static void main(String[] args) {
        Funca funcionario = new Funca();
        funcionario.setNome("Ívano");
        funcionario.setIdade(35);
        funcionario.setSalarios(new double[]{1000, 2000, 4000});

        funcionario.imprime();
        System.out.println("---------------");
        System.out.println(funcionario.getMedia());
    }
}
