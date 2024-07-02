package academy.devdojo.maratonajava.Exception.exception.teste;

import academy.devdojo.maratonajava.Exception.exception.dominio.Leitor1;
import academy.devdojo.maratonajava.Exception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTeste01 {
    public static void main(String[] args) {
        lerArquivoRec();
    }

    public static void lerArquivoRec() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {

        }
    }

    public static void lerArquivo() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
