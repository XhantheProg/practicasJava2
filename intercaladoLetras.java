import java.util.Queue;
import java.util.LinkedList;

public class intercaladoLetras {
    public static void main(String[] args) {
        // Crear las dos colas
        Queue<String> cola1 = new LinkedList<>();
        Queue<String> cola2 = new LinkedList<>();

        // Agregar elementos a la primera cola
        cola1.offer("A");
        cola1.offer("B");
        cola1.offer("C");
        cola1.offer("D");
        cola1.offer("E");

        // Agregar elementos a la segunda cola
        cola2.offer("1");
        cola2.offer("2");
        cola2.offer("3");
        cola2.offer("4");
        cola2.offer("5");

        // Intercalar los elementos de las dos colas en una tercera cola
        Queue<String> cola3 = intercalarColas(cola1, cola2);

        // Imprimir los elementos de la tercera cola
        System.out.println("Elementos de la tercera cola:");
        while (!cola3.isEmpty()) {
            System.out.println(cola3.poll());
        }
    }

    public static Queue<String> intercalarColas(Queue<String> cola1, Queue<String> cola2) {
        Queue<String> colaIntercalada = new LinkedList<>();

        while (!cola1.isEmpty() || !cola2.isEmpty()) {
            if (!cola1.isEmpty()) {
                colaIntercalada.offer(cola1.poll());
            }
            if (!cola2.isEmpty()) {
                colaIntercalada.offer(cola2.poll());
            }
        }

        return colaIntercalada;
    }
}
