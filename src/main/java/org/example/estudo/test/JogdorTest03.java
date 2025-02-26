package org.example.estudo.test;

import Asocciacao.Dominio.Jogador;
import Asocciacao.Dominio.Time;

public class JogdorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Messi");
        Time time01 = new Time("Argentina");
        Jogador [] jogadores = {jogador};


        jogador.setTime(time01);

        time01.setJogadores(jogadores);

        System.out.println("---jogador---");

        jogador.imprime();

        System.out.println("---jogador---");

        time01.imprime();



    }
}
