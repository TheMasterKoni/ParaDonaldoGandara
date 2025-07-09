package org.example.Nivel2;
import java.util.Scanner;
public class InvertirNum {
    public static void main(String[] args) {
        String resultado=" ";
        System.out.println("Escribir numero a invertir");
        Scanner in=new Scanner(System.in);
        String input=in.nextLine();

        for (int i=input.length()-1;i>=0;i--){
            resultado+=String.valueOf(input.charAt(i));
        }
        System.out.println("el numero invertido es: "+resultado+" numero normal: "+input);
    }
}
