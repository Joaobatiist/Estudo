package Asocciacao.test;

import Asocciacao.Dominio.Jogador;
import Asocciacao.Dominio.Time;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Péle");
        Time time = new Time("Seleçao Brasileira");

        jogador.setTime(time);
        jogador.imprime();
    }
}
