package academy.devdojo.maratonajava.classes.dominio;

public class Funca {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media = 0;

    public void imprime() {
        System.out.println(nome);
        System.out.println(idade);
        if (salarios == null) {
            return;
        }
        for(double salario: salarios) {
            System.out.print(salario + " ");
        }
        mediaSalarial();
    }

    public void mediaSalarial() {
        if(salarios == null) {
            return;
        }
        for(double salario: salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}
