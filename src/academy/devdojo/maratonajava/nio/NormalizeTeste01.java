package academy.devdojo.maratonajava.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTeste01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/ivano/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        Path path2 = Paths.get("/home/./ivano/./dev");
        System.out.println(path1);
        System.out.println(path1.normalize());
        System.out.println(path2.normalize());
    }
}
