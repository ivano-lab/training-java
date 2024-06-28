package academy.devdojo.maratonajava.interfaces.dominio;

public class DatabaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco...");
    }
}
