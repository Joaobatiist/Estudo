package org.example.estudo.test;



import Asocciacao.Dominio.Escola;
import Asocciacao.Dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor("joao", "gerente");
        Professor [] professores = {professor};
        Escola escola = new Escola("unijorge", professores);

        escola.imprime();

    }
}
