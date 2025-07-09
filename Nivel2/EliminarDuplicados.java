package org.example.Nivel2;

import java.util.*;

public class EliminarDuplicados {

    public static void main(String[] args) {
        int[][] matriz = {
                {5, 3, 2},
                {3, 8, 5},
                {9, 2, 1}
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        int[] sinDuplicados = eliminarDuplicados(matriz);

        System.out.println("\nValores únicos (sin duplicados):");
        System.out.println(Arrays.toString(sinDuplicados));
    }


    public static int[] eliminarDuplicados(int[][] matriz) {
        Set<Integer> conjunto = new LinkedHashSet<>();

        for (int[] fila : matriz) {
            for (int valor : fila) {
                conjunto.add(valor);
            }
        }


        int[] resultado = new int[conjunto.size()];
        int i = 0;
        for (int val : conjunto) {
            resultado[i++] = val;
        }

        return resultado;
    }


    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }
}
