package org.example.Nivel4;
import java.util.Scanner;
public class ParentesisBalanceados {
    public static void main(String[] args) {
        System.out.println("Insertar parentesis");
        Scanner in=new Scanner(System.in);
        String input=in.nextLine();
        System.out.println("sus parentesis: "+parenBalanceado(input));
    }
    public static String parenBalanceado(String pare){
        if (pare.equals("()")){
            return "Son baleanciados";
        } else if (pare.equals("[]")) {
            return "Son baleanciados";
        } else if (pare.equals("{}")) {
            return "Son baleanciados";
        }else {
            return "no son valenciados";
        }
    }
}
