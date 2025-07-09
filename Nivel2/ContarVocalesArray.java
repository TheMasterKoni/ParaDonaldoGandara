package org.example.Nivel2;
import java.util.Scanner;
public class ContarVocalesArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("escribir palabra");
        String input = in.nextLine();
        int cVocales=0;

        for (int i=0;i<=input.length()-1;i++){
            if (esVocal(input.charAt(i))){
                cVocales++;
            }
        }
        System.out.println("esta palabra, tiene: "+cVocales+" vocales");
    }

    public static boolean esVocal(char vocal) {
        if ('a' == vocal) {
            return true;
        } else if ('e' == vocal) {
            return true;
        } else if ('i' == vocal) {
            return true;
        } else if ('o' == vocal) {
            return true;
        } else if ('u' == vocal) {
            return true;
        }
        return false;
    }
}
