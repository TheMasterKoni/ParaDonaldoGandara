package org.example.Nivel4;

import java.util.HashMap;
import java.util.Scanner;
/*
 Lógica del algoritmo:
Recorremos el número romano de izquierda a derecha.

Si el valor actual es menor que el siguiente, lo restamos.

Si es mayor o igual, lo sumamos.

Ejemplo:
IX = 1 < 10 → 10 - 1 = 9
XII = 10 + 1 + 1 = 12


 */
public class RomanoAEntero {
    public static void main(String[] args) {
        System.out.println("Ingrese el numero en romano");
        Scanner in=new Scanner(System.in);
        String romano = in.nextLine();
        int resultado = convertirRomanoAEntero(romano);
        System.out.println("Número entero: " + resultado);
    }

    public static int convertirRomanoAEntero(String s) {
        HashMap<Character, Integer> mapa = new HashMap<>();
        mapa.put('I', 1);
        mapa.put('V', 5);
        mapa.put('X', 10);
        mapa.put('L', 50);
        mapa.put('C', 100);
        mapa.put('D', 500);
        mapa.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int valorActual = mapa.get(s.charAt(i));


            if (i < s.length() - 1 && valorActual < mapa.get(s.charAt(i + 1))) {
                total -= valorActual;
            } else {
                total += valorActual;
            }
        }

        return total;
    }
}

