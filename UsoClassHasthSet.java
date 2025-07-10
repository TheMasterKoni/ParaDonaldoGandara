package org.example;

import java.util.HashSet;
/*
la clase HashSet, es una clase que nos limpia los datos duplicados, como se ve en este ejemplo
 */
public class UsoClassHasthSet {
    public static void main(String[] args) {
        HashSet<String> frutas = new HashSet<>();

        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Manzana"); // Ignorado, ya está

        System.out.println(frutas); // Solo imprime una "Manzana"
    }
}

