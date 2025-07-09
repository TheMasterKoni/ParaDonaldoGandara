package org.example.Nivel2;

import java.util.HashSet;
import java.util.Set;

public class NRepetido {

    public static void main(String[] args) {
        int[][] matriz = {
                {5, 3, 2},
                {8, 3, 1},
                {9, 6, 2}
        };

        Integer repetido = encontrarPrimerRepetido(matriz);

        if (repetido != null) {
            System.out.println("El primer número repetido es: " + repetido);
        } else {
            System.out.println("No hay números repetidos.");
        }
    }

    public static Integer encontrarPrimerRepetido(int[][] matriz) {
        Set<Integer> vistos = new HashSet<>();

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                int num = matriz[fila][col];
                if (vistos.contains(num)) {
                    return num; // Primer número repetido encontrado
                }
                vistos.add(num);
            }
        }

        return null; // Si no se encontró ningún número repetido
    }
}
