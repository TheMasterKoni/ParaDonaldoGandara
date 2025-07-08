package org.example;

public class FibonaccioIterativo {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        String resultado = a + ", " + b + ", ";

        for (int i = 2; i < 10; i++) {
            int c = a + b;
            resultado += c + ", ";
            a = b;
            b = c;
        }
        System.out.println("Los primeros 10 números de Fibonacci son: " + resultado);
    }
}
