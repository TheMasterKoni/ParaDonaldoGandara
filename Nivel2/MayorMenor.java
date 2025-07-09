package org.example.Nivel2;

public class MayorMenor {

    public static void main(String[] args) {
        int[] numeros = {23, 5, 89, 12, -4, 56, 3};

        int mayor = encontrarMayor(numeros);
        int menor = encontrarMenor(numeros);

        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
    }

    public static int encontrarMayor(int[] array) {
        int mayor = array[0];

        for (int num : array) {
            if (num > mayor) {
                mayor = num;
            }
        }

        return mayor;
    }

    public static int encontrarMenor(int[] array) {
        int menor = array[0];

        for (int num : array) {
            if (num < menor) {
                menor = num;
            }
        }

        return menor;
    }
}

