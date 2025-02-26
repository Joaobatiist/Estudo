package org.example.estudo.testeMetodo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class filaCarnaval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo ao Organizador de Filas do Carnaval de Salvador!");

        while (true) {
            System.out.println("\nDigite a quantidade de pessoas em cada fila (ou 0 para sair): ");
            int N = sc.nextInt();
            if (N == 0) {
                System.out.println("Saindo... Até a próxima!");
                break;
            }

            processarFila(sc, N);
        }

        sc.close();
    }

    private static void processarFila(Scanner sc, int N) {
        Queue<String> filaMulheres = new LinkedList<>();
        Queue<String> filaHomens = new LinkedList<>();
        Queue<String> mulheresErradas = new LinkedList<>();
        Queue<String> homensErrados = new LinkedList<>();

        System.out.println("\nAgora, informe as pessoas na fila feminina:");
        for (int i = 0; i < N; i++) {
            System.out.print("Nome e Gênero (M ou H): ");
            String nome = sc.next();
            char genero = sc.next().charAt(0);

            if (genero == 'M') {
                filaMulheres.add(nome);
            } else {
                homensErrados.add(nome);
            }
        }

        System.out.println("\nAgora, informe as pessoas na fila masculina:");
        for (int i = 0; i < N; i++) {
            System.out.print("Nome e Gênero (M ou H): ");
            String nome = sc.next();
            char genero = sc.next().charAt(0);

            if (genero == 'H') {
                filaHomens.add(nome);
            } else {
                mulheresErradas.add(nome);
            }
        }

        // Adicionar as pessoas que estavam erradas ao final das filas corretas
        filaMulheres.addAll(mulheresErradas);
        filaHomens.addAll(homensErrados);

        // Exibir resultado final
        exibirFila("Fila Feminina", filaMulheres);
        exibirFila("Fila Masculina", filaHomens);
    }

    private static void exibirFila(String nomeFila, Queue<String> fila) {
        System.out.println("\n" + nomeFila + ":");
        if (fila.isEmpty()) {
            System.out.println("Vazia");
        } else {
            for (String pessoa : fila) {
                System.out.println(pessoa);
            }
        }
    }
}