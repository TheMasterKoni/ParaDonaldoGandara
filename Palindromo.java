package org.example;

import java.util.Scanner;
/*
un palindromo es una palabra, que tanto en reversa como normal, se le de la misma manera
ejemplo:Amo la paloma, se le igual del lado contrario
 */
public class Palindromo {


    public static void main(String[] args) {
        String resultado = "";
        System.out.println("Escribe la palabra a evaluar");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int r=input.length();

        boolean espalindromo=false;
       for (int i=r-1;i>=0;i--){
          resultado+=String.valueOf(input.charAt(i));
       }
        if (resultado.equals(input)){
            espalindromo=true;
        }

      if (espalindromo){
          System.out.println("la pabra en cuestion es palindromo en reversa: "+resultado+" norma: "+input);
      }else{
          System.out.println("la palabra es cuestion no es palindromo en reversa: "+resultado+" normal "+ input);
      }
    }
}