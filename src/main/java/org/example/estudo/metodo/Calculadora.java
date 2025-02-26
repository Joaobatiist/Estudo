package org.example.estudo.metodo;

public class Calculadora {
    public double divisao(double num1, double num2) {
        if (num2 != 0 && num1 != 0) {
            return num1 / num2;
        }
        return 0;
    }
    public void DivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 ==0){
            System.out.println("Nao Existe divisao por zero");
            return;
        }
            System.out.println(num1/num2);


    }


    public void AlteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;

        System.out.println("Dentro do altera dois numeros");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }
    public void somaArray(int [] numeros){
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
