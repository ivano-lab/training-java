package academy.devdojo.maratonajava.classes.dominio;

public class Humano {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de initicalização estático de Humano...");
    }

    {
        System.out.println("Dentro do bloco de initicalização não estático de Humano 1...");
    }

    {
        System.out.println("Dentro do bloco de initicalização não estático de Humano 2...");
    }

    public Humano(String nome) {
        System.out.println("Dentro do construtor de Humano...");
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("*** Endereço ***");
        System.out.println("Rua: " + this.endereco.getRua());
        System.out.println("CEP: " + this.endereco.getCep());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
