package org.example.Nivel2;

import java.util.HashSet;
import java.util.Set;

public class Anagramas {


    private static final Set<String> diccionario = new HashSet<>();

    public static void main(String[] args) {

        String palabra = "roma";


        cargarDiccionario();

        System.out.println("Anagramas reales de: " + palabra);
        generarAnagramas("", palabra);
    }

    public static void cargarDiccionario() {
        // Puedes añadir más palabras aquí
        diccionario.add("roma");
        diccionario.add("amor");
        diccionario.add("omar");
        diccionario.add("ramo");
        diccionario.add("mora");
        diccionario.add("aroma");
        diccionario.add("roam"); // inglés, pero lo dejo por si acaso
    }

    public static void generarAnagramas(String prefijo, String resto) {
        int n = resto.length();
        if (n == 0) {

            if (diccionario.contains(prefijo)) {
                System.out.println(prefijo);
            }
        } else {
            for (int i = 0; i < n; i++) {
                generarAnagramas(
                        prefijo + resto.charAt(i),
                        resto.substring(0, i) + resto.substring(i + 1));
            }
        }
    }
}

