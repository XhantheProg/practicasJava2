import java.util.LinkedList;
import java.util.Queue;

public class Agregar_letras {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // añadir elementos "A", "B", "C", "D", and "E" a la cola
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");

        // Imprime y remueve todos los elementos de la cola
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // añade elementos "F", "G", "H", "I", y "J" a la cola
        queue.add("F");
        queue.add("G");
        queue.add("H");
        queue.add("I");
        queue.add("J");

        // Imprime y añade elementos a la cola
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}