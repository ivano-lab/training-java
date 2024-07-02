package academy.devdojo.maratonajava.Exception.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste02 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo/teste.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado: " + isCreated);
        }catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Problema ao criar arquivo.");
        }
    }
}
