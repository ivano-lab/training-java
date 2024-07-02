package academy.devdojo.maratonajava.interfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados de arquivo...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo arquivo...");
    }

    @Override
    public void checkPersimission() {
        System.out.println("Checando permissões no arquivo...");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize no FileLoader...");
    }
}
