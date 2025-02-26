package org.example.estudo.testeMetodo;

import org.example.estudo.metodo.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1= 1;
        int num2= 2;

        calc.AlteraDoisNumeros(num1,num2);
        System.out.println("-----------------------------");
        System.out.println( num1);
        System.out.println( num2);
    }
}
