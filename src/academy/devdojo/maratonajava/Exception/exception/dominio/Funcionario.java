package academy.devdojo.maratonajava.Exception.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {

    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Quebra esse galho que eu salvo no RH...");
    }
}
