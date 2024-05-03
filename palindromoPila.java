package practicasJava2;

import java.util.Stack;

public class palindromoPila {
    public static void main(String[] args) {
        String cadena = "anitalavalatino";

        if (esPalindromo(cadena)) {
            System.out.println("La cadena '" + cadena + "' es un palíndromo.");
        } else {
            System.out.println("La cadena '" + cadena + "' no es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String cadena) {
        Stack<Character> pila = new Stack<>();

        // Llenar la pila con los caracteres de la mitad izquierda de la cadena
        int longitud = cadena.length();
        int mitad = longitud / 2;
        for (int i = 0; i < mitad; i++) {
            pila.push(cadena.charAt(i));
        }

        // Comparar los caracteres de la mitad derecha de la cadena con los de la pila
        int inicio = (longitud % 2 == 0) ? mitad : mitad + 1;
        for (int i = inicio; i < longitud; i++) {
            if (cadena.charAt(i) != pila.pop()) {
                return false; // No es un palíndromo
            }
        }

        return true; // Es un palíndromo
    }
}
