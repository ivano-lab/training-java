package academy.devdojo.maratonajava.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTeste01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("/home/ivano/Documentos/java/bomdemaisAPP/MaratonaJiraya/arquivo/file.txt");
        Path p2 = Paths.get("/home/ivano/Documentos/java/bomdemaisAPP/MaratonaJiraya/arquivo/","file.txt");
        Path p3 = Paths.get("/home", "/ivano/Documentos/java/bomdemaisAPP/MaratonaJiraya/arquivo/file.txt");
        System.out.println(p1.getFileName().toFile());
        System.out.println(p2.getFileName().toFile());
        System.out.println(p3.getFileName().toFile());
    }
}
