package academy.devdojo.maratonajava.classes.dominio;

public class Carro {

    private String nome;
    private double velMax;
    private static double velLim = 250;

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

    public static void setVelLim(double velLim){
        Carro.velLim = velLim;
    }

    public static double getVelLim() {
        return Carro.velLim;
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
