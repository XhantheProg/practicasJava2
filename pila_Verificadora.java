import java.util.Stack;

public class pila_Verificadora {
    public static void main(String[] args) {
        Stack<String> Pila = new Stack<>();

        System.out.println("La pila esta vacia? " + Pila.isEmpty());

        // Añade itemas a la pila
        Pila.push("A");
        Pila.push("B");
        Pila.push("C");

        System.out.println("La pila esta vacia? " + Pila.isEmpty());
    }
}
