package org.example;


/*
Fibonaccio es un matematico, que invento un algoritmo matematico, para calcular la población de conejos
relativo a los meses,
En Programacion hay 2 formas de hacerlo, empleando bucles(Iterativo) y empeando funciones(Recursivo)

consiste simplemente en sumar continuamente el ultimo valor con el penultimo para dar los demas, e aqui la secuencia
0,1,1,2,3,5,8,13,21,34,55,89,144,233,610,987,1597

RECURCIVO
factorial(4) = 4 * factorial(3)
factorial(3) = 3 * factorial(2)
factorial(2) = 2 * factorial(1)
factorial(1) = 1  (caso base)


factorial(1) → 1
factorial(2) → 2 * 1 = 2
factorial(3) → 3 * 2 = 6
factorial(4) → 4 * 6 = 24

 */
public class FibonaccioRecursivo {
    public static void main(String[] args) {
        String resultado=" ";
        for (int i=0;i<10;i++){
          resultado+= fibonaccio(i)+" ";
        }
        System.out.println("A continuación los primeros 10 numeros de fibonaccio: "+resultado);
    }
    public static int fibonaccio(int n){
        if (n<=0){
            return 0;
        } else if (n==1) {
            return 1;
        } else {
            return fibonaccio(n -1) + fibonaccio(n -2);
        }
    }
}
