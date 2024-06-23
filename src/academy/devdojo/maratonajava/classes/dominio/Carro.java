package academy.devdojo.maratonajava.classes.dominio;

public class Carro {

    private String nome;
    private double velMax;
    public static double velLim = 250;

    public Carro(String nome, double velMax) {
        this.nome = nome;
        this.velMax = velMax;
    }

    public void imprime() {
        System.out.println("-----------------");
        System.out.println("NOme: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velMax);
        System.out.println("Velocidade Limite: " + Carro.velLim);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelMax() {
        return velMax;
    }

    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }

}
