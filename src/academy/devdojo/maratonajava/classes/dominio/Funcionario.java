package academy.devdojo.maratonajava.classes.dominio;

public class Funcionario extends Humano {
    private double salario;

    static {
        System.out.println("Dentro do bloco de initicalização estático de Funcionario...");
    }

    {
        System.out.println("Dentro do bloco de initicalização não estático de Funcionario 1...");
    }

    {
        System.out.println("Dentro do bloco de initicalização não estático de Funcionario 2...");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de Funcionario...");
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }

    public void relatorioPag(){
        System.out.println("Eu " + this.nome + "recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
