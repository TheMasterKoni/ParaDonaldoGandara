package org.example;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Escribe el número para sacar su factorial:");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int resultado = factorial(input);
        System.out.println("El resultado de su número factorial es: " + resultado);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);  // Llamada recursiva
    }
}
