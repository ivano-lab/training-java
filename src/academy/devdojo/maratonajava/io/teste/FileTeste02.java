package academy.devdojo.maratonajava.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTeste02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCriated = fileDiretorio.mkdir();
        System.out.println("diretório criado: " + isDiretorioCriated);
        File fileArquivoDiretorio = new File(fileDiretorio,"arquivo2.txt");
        boolean isFileCriated = fileArquivoDiretorio.createNewFile();
        System.out.println("arquivo criado: " + isFileCriated);

        File fileRenamed = new File(fileDiretorio,"arquivo3.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("arquivo renomeado: " + isRenamed);

        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("diretório renomeado: " + isDiretorioRenamed);
    }
}
