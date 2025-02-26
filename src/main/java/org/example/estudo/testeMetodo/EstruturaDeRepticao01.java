package org.example.estudo.testeMetodo;

public class EstruturaDeRepticao01 {
    public static void main(String[] args) {
        double valortotal = 30000;
        for (int parcela = 1; parcela <= valortotal ; parcela++) {
            double valorDaParcela = valortotal / parcela;
            if (valorDaParcela  < 1000) {
         continue;

        }
            System.out.println("Parcela " + parcela + ": R$ " + valorDaParcela);
        }

    }

}