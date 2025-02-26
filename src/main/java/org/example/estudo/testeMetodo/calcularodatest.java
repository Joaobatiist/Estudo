package org.example.estudo.testeMetodo;

import org.example.estudo.metodo.Calculadora;

public class calcularodatest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divisao(20,10);
        System.out.println(result);
        System.out.println("----------------------------------------------");

      calculadora.DivisaoDeDoisNumeros(86,0);
    }
}
