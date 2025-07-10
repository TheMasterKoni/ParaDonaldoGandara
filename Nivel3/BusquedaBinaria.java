package org.example.Nivel3;
import java.util.Scanner;
public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] num= {5,6,1,65,7,1,8,88};
        mostraMatriz(num);

        Scanner in=new Scanner(System.in);
        System.out.println("Ingrese el numero a buscar: ");
        int input=in.nextInt();
        int posicion=0;
        boolean esta=false;
        for (int i=0;i<= num.length-1;i++) {
            if (input==num[i]){
                esta=true;
                posicion=i+1;
            }
        }
        if (esta){
            System.out.println("el valor buscado si esta en la matriz es: "+input+" esta en la posicion: "+posicion);
        }
    }

    public static void mostraMatriz(int[] n) {
        System.out.println("estos son los valores que tiene la matriz: ");
        for (int num : n) {
            System.out.print(" "+num);
        }
        System.out.println();
    }
}

