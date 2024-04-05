import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        // Verificar si el número ingresado es positivo
        if (numero < 0) {
            System.out.println("El número ingresado no es positivo.");
        } else {
            int factorial = 1;
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        scanner.close();
    }
}
