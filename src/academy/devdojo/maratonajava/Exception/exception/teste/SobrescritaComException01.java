package academy.devdojo.maratonajava.Exception.exception.teste;

import academy.devdojo.maratonajava.Exception.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.Exception.exception.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.Exception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComException01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario sivirino = new Funcionario();

        try {
            sivirino.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
