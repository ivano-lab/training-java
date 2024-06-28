package academy.devdojo.maratonajava.classes.teste;

import academy.devdojo.maratonajava.classes.dominio.Aluno;
import academy.devdojo.maratonajava.classes.dominio.Local;
import academy.devdojo.maratonajava.classes.dominio.Professor;
import academy.devdojo.maratonajava.classes.dominio.Seminario;

public class AssociacaoTeste01 {
    public static void main(String[] args) {
        Local local = new Local("Sala comunal da Grifinória");
        Aluno aluno = new Aluno("Harry Potter", 17);
        Professor professor = new Professor("Alastor Moody", "Criminologia");
        Aluno[] alunosSeminario = {aluno};
        Seminario seminario = new Seminario("Defesa Contra as Artes das Trevas", alunosSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
