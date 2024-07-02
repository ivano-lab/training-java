package academy.devdojo.maratonajava.Exception.exception.teste;

import academy.devdojo.maratonajava.Exception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste01 {
    public static void main(String[] args) throws LoginInvalidoException {
        logar();
    }

    private static void logar() throws LayerInstantiationException, LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Batman";
        String senhaDB = "coringa";
        System.out.print("Usuário: ");
        String usernameDig = teclado.nextLine();
        System.out.print("Senha: ");
        String senhaDig = teclado.nextLine();
        if(!usernameDB.equals(usernameDig) || !senhaDB.equals(senhaDig)) {
            throw new LoginInvalidoException("Usuário ou senha inválido!");
        }

        System.out.println("Usuário logado com sucesso!");
    }
}
