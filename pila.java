import java.util.Stack;

public class pila {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        // Añade elementos a la pila
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        System.out.println("Pila: " + pila);

        // muestra de elementos en reversa
        System.out.println("Elementos en orden de reversa:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }
}