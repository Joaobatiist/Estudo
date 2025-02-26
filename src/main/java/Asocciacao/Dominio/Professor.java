package Asocciacao.Dominio;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Professor {
    private String nome;
    private String especialidade;
    private Seminario [] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }
public void imprime (){
    System.out.println("---------");
    System.out.println("Professor: " + this.nome);
    if (this.seminarios == null ) return;
    System.out.println("## Seminarios cadastrados##");

    for (Seminario seminario : this.seminarios){
        System.out.println(seminario.getTitulo());
        System.out.println(seminario.getLocal().getEndereco());
        System.out.println("** Alunos **");
        for (Aluno aluno : seminario.getAlunos()) {
            System.out.println("Aluno: " + aluno.getNome() + "idade: " + aluno.getIdade());

        }


    }
}


}
