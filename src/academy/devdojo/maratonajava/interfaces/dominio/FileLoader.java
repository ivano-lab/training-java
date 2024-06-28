package academy.devdojo.maratonajava.interfaces.dominio;

public class FileLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados de arquivo...");
    }
}
