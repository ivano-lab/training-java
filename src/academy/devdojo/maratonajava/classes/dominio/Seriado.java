package academy.devdojo.maratonajava.classes.dominio;

public class Seriado {
    private String nome;
    private int[] episodios;
    {
        System.out.println("Dentro do bloco de inicialização...");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    public Seriado(String nome) {
        this.nome = nome;
    }

    public Seriado() {
        for(int episodio: this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
