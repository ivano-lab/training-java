package academy.devdojo.maratonajava.interfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados...");
    }

    @Override
    public void checkPersimission() {
        System.out.println("Checando permissões nos dados...");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize no DatabaseLoader...");
    }
}
