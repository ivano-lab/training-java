package academy.devdojo.maratonajava.classes.dominio;

public class Anime {
    private String nome;
    private String genero;
    private int episodios;
    private String tipo;
    private String estudio;

    public Anime(String nome, String genero, int episodios, String tipo){
        this();
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
        this.tipo = tipo;
    }

    public Anime() {
        System.out.println("Construtor vazio...");
    }

    public Anime(String nome, String genero, int episodios, String tipo, String estudio){
        this(nome, genero, episodios, tipo);
        this.estudio = estudio;
    }

    public void imprime() {
        System.out.println("Título: " + this.nome);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Episódios: " + this.episodios);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Estudio: " + this.estudio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
