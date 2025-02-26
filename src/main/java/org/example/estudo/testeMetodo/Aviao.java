package org.example.estudo.testeMetodo;

import java.util.Scanner;

import static java.lang.System.in;

public class Aviao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        System.out.println("escreva o tamanho da asa do avião");
        int rows = sc.nextInt();
        String corpo = "9";
        System.out.println("Digite o comprimento do aviao, sendo ele de 80 para cima.");
        int comprimento = sc.nextInt();


        if (comprimento < 80) {
            System.out.println("comprimento menor que 80");
            return ;
        }


        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < (rows - 1) ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i -1); k++) {
                System.out.print(9);
            }

            System.out.println();

            sc.close();

        }

        for (int z = 0; z <= 3; z++) {
            System.out.println(corpo.repeat(comprimento));
        }

        for (int i = rows; i > -1; i--) {
            for (int j = 0; j < (rows - 1) ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print(9);
            }

            System.out.println();


        }

    }
}


