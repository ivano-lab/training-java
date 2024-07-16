package academy.devdojo.maratonajava.io.teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)){
            fw.write("Bora escrever...\n de novo!");
            fw.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
