package Asocciacao.Dominio;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Aluno {

    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }
    public Aluno(String nome, int idade, Seminario seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }


}
