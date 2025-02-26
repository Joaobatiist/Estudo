package org.example.estudo.test;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("o grande software de previsao do futuro");
        System.out.println("Digite sua pergunta e eu responderei");

       String pergunta = input.nextLine();
       if (pergunta.charAt(0) == ' ') {
           System.out.println("SIM");
       } else {
           System.out.println("NAO");
       }
    }
}
