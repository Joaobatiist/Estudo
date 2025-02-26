package org.example.estudo.test;

import org.example.estudo.Estudante.Estudante;
import org.example.estudo.Estudante.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.nome = "Midoriya";
        estudante.idade = 20;
        estudante.sexo = 'M';


        estudante2.nome = "Joao";
        estudante2.idade = 21;
        estudante2.sexo = 'F';


        impressora.imprime(estudante);

        impressora.imprime(estudante2);

        System.out.println("##################");

        impressora.imprime(estudante);

        impressora.imprime(estudante2);
    }
}
