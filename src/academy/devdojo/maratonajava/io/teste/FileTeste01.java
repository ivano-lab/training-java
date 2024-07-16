package academy.devdojo.maratonajava.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTeste01 {
    public static void main(String[] args) {
        File file = new File("/Documentos/java/MaratonaJiraya/arquivo/File.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created: " + isCreated);
            System.out.println("Caminho: " + file.getPath());
            System.out.println("Caminho absoluto: " + file.getAbsolutePath());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Is file: " + file.isFile());
            System.out.println("Is Hidden: " + file.isHidden());
            System.out.println("Last Modified: " + new Date(file.lastModified()));
            boolean exists = file.exists();
            if(exists) {
                System.out.println("Deleted: " + file.delete());
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
