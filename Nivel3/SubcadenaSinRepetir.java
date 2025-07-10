package org.example.Nivel3;
import java.util.HashSet;

public class SubcadenaSinRepetir {
    public static void main(String[] args) {
        String texto = "abcabcbb";
        System.out.println("Longitud máxima: " + longitudMaximaSubcadena(texto));
    }

    public static int longitudMaximaSubcadena(String s) {
        int max = 0;
        int izquierda = 0;
        HashSet<Character> set = new HashSet<>();

        for (int derecha = 0; derecha < s.length(); derecha++) {
            while (set.contains(s.charAt(derecha))) {
                set.remove(s.charAt(izquierda));
                izquierda++;
            }
            set.add(s.charAt(derecha));
            max = Math.max(max, derecha - izquierda + 1);
        }
        return max;
    }
}
