import java.util.Scanner;

public class sumaMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de tamaño de la matriz
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        // Declaración de matrices
        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        int[][] suma = new int[filas][columnas];

        // Ingreso de elementos de la matriz 1
        System.out.println("Ingrese los elementos de la matriz 1:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz1[i][j] = scanner.nextInt();
            }
        }

        // Ingreso de elementos de la matriz 2
        System.out.println("Ingrese los elementos de la matriz 2:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz2[i][j] = scanner.nextInt();
            }
        }

        // Suma de matrices
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Imprimir la suma de las matrices
        System.out.println("La suma de las matrices es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

