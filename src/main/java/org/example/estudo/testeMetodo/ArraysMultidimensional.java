package org.example.estudo.testeMetodo;

public class ArraysMultidimensional {
    public static void main(String[] args) {
        int[][] dias = {{1, 2, 3, 4, 5, 6}, {10, 20, 30, 40, 50}};


        for(int[] array: dias){
            for(int element: array){
                System.out.println(element + " ");
            }
        }

    }
}
