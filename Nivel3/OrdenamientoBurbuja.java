package org.example.Nivel3;
public class OrdenamientoBurbuja {
    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 4, 2};

        System.out.println("Antes del ordenamiento:");
        mostrarArreglo(numeros);

        ordenarBurbuja(numeros);

        System.out.println("\nDespués del ordenamiento:");
        mostrarArreglo(numeros);
    }

    public static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        boolean cambio;


        for (int i = 0; i < n - 1; i++) {
            cambio = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    cambio = true;
                }
            }


            if (!cambio) break;
        }
    }

    public static void mostrarArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}



