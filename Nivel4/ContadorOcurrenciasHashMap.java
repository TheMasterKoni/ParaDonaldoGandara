package org.example.Nivel4;

import java.util.HashMap;

public class ContadorOcurrenciasHashMap {
    public static void main(String[] args) {
        String frase = "hola mundo hola java hola mundo";


        String[] palabras = frase.split(" ");


        HashMap<String, Integer> contador = new HashMap<>();


        for (String palabra : palabras) {
            if (contador.containsKey(palabra)) {
                contador.put(palabra, contador.get(palabra) + 1);
            } else {
                contador.put(palabra, 1);
            }
        }


        System.out.println("Conteo de palabras:");
        for (String clave : contador.keySet()) {
            System.out.println(clave + " → " + contador.get(clave));
        }
    }
}
