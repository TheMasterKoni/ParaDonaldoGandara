package org.example.Nivel3;

public class SumasDePares {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 3, 5, 7, 8, -1};
        int objetivo = 7;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] + numeros[j] == objetivo) {
                    System.out.println("Par encontrado: (" + numeros[i] + ", " + numeros[j] + ")");
                }
            }
        }
    }
}
