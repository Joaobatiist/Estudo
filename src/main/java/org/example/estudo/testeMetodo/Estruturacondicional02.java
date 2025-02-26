package org.example.estudo.testeMetodo;

import java.util.Scanner;
// idade < 15 infatil
// idade >= 15 && idade < 18 juvenil
// idade >= 18 adulto
public class Estruturacondicional02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("digite sua idade");
        int idade = input.nextInt();

        if (idade < 15){
            System.out.println("Sua categoria é infatil");
        } else if (idade >= 15 && idade < 18){
            System.out.println("Sua catégoria é juvenil");
        } else if (idade >= 18){
            System.out.println("Sua catégoria é adulto");
        }
    }
}
