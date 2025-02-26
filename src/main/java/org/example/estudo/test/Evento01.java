package org.example.estudo.test;


import Asocciacao.Dominio.Aluno;
import Asocciacao.Dominio.Local;
import Asocciacao.Dominio.Professor;
import Asocciacao.Dominio.Seminario;

public class Evento01 {
    public static void main(String[] args) {
        Local local = new Local ("Rua das margaridas");
        Professor professor = new Professor("Roberta", "Medicina");
        Professor [] professores = {professor};
        Aluno aluno = new Aluno("Joao ", 17 );
        Aluno [] alunos = {aluno};
        Seminario seminario = new Seminario("Parada cardiaca", alunos, professores, local);
        Seminario[] seminarios = {seminario};

        professor.setSeminarios(seminarios);

        professor.imprime();
    }
}
