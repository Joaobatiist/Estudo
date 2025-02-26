package org.example.estudo.testeMetodo;

import java.util.Scanner;

import static java.lang.System.in;

public class piramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        System.out.println("escreva um numero");
        int rows = sc.nextInt();

        // Reduçao do codigo
        for (int i = 1; i <= rows; i++) {
           System.out.print(">".repeat(rows - i));
            System.out.print("*".repeat(2 * i - 1));
            System.out.println();



            // primeira forma do codigo da piramide.
           /*for (int j = 0; j < (rows - 1) ; j++) {
               System.out.print(" ");
           }
           for (int k = 0; k < (2 * i -1); k++) {
                System.out.print("*");
            }

            System.out.println();

            sc.close(); */

        }

    }
}

