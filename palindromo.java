import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase: ");
        String palabra = scanner.nextLine().toLowerCase(); // Convertir la entrada a minúsculas.

        boolean esPalindromo = true;
        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) { //chat at es el método devuelve el carácter en el índice definido
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La palabra/frase es un palíndromo.");
        } else {
            System.out.println("La palabra/frase no es un palíndromo.");
        }

        scanner.close();
    }
}
