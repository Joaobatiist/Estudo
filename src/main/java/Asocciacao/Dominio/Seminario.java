package Asocciacao.Dominio;


import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Seminario {

    private String titulo;
    private Aluno [] alunos;
    private Professor[] professores;
    private Local local;

    public Seminario(String titulo, Aluno[] alunos, Professor[] professores, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.professores = professores;
        this.local = local;
    }



}