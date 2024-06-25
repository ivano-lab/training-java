package academy.devdojo.maratonajava.classes.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    public void imprime() {
        System.out.println("Instituição: " + this.nome);
        if(professores == null) return;
        System.out.println("Corpo docente: ");
        for (Professor professor : professores) {
            System.out.println("Professor(a): " + professor.getNome());
        }
    }

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
