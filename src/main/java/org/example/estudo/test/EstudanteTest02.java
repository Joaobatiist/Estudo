package org.example.estudo.test;

import org.example.estudo.Estudante.Estudante;
import org.example.estudo.Estudante.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();


        estudante.nome = "Midoriya";
        estudante.idade = 20;
        estudante.sexo = 'M';


        estudante2.nome = "Rafael";
        estudante2.idade = 21;
        estudante2.sexo = 'F';


    estudante.imprime();
    estudante2.imprime();
    }
}
