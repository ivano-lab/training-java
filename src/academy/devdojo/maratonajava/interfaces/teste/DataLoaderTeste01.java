package academy.devdojo.maratonajava.interfaces.teste;

import academy.devdojo.maratonajava.interfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.interfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.interfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileloader = new FileLoader();
        databaseLoader.load();
        fileloader.load();

        databaseLoader.remove();
        fileloader.remove();

        databaseLoader.checkPersimission();
        fileloader.checkPersimission();

        DataLoader.retrieveMaxDataSize();
        databaseLoader.retrieveMaxDataSize();
        fileloader.retrieveMaxDataSize();
    }
}
