import java.util.Scanner;
import java.util.Stack;

public class pila_Enteros {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        // Añade elementos a la pila
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        System.out.println("Pila: " + pila);

        System.out.println("Pon un numero para revisar si esta en la pila o no:");
        int number = scanner.nextInt();

        System.out.println("Es " + number + " en la pila? " + pila.contains(number));
    }
}