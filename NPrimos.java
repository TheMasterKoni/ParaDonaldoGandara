package org.example;

public class NPrimos {
    public static void main(String[] args) {
        String resultado=" ";
        Integer numero=1;
        int contador=0;
        while (contador<100){
            if (esPrimo(numero)){
                resultado += numero + ", ";
                contador++;
            }
            numero++;
        }
        System.out.println("estos son los primeros 100 numeros primos: "+resultado);
    }
    private static Boolean esPrimo(Integer numero){
        Boolean noPrimo=true;
        for (int i=2;i<numero;i++){
            if (numero % i == 0){
                noPrimo=false;
            }
        }
        return noPrimo;
    }
}
