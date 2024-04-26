import java.util.LinkedList;
import java.util.Queue;

public class Intercalado {
    public static void main(String[] args) {
        Queue<Character> cola1 = new LinkedList<>();
        Queue<Integer> cola2 = new LinkedList<>();
        Queue<Object> cola3 = new LinkedList<>();

        // Añade elementos a la primera cola
        for (char c = 'A'; c <= 'E'; c++) {
            cola1.add(c);
        }

        // Añade elementos a la segunda cola
        for (int i = 1; i <= 5; i++) {
            cola2.add(i);
        }

        System.out.println("Cola 1: " + cola1);
        System.out.println("Cola 2: " + cola2);

        // Intercala los elementos de las 2 colas a la tercera cola
        while (!cola1.isEmpty() || !cola2.isEmpty()) {
            if (!cola1.isEmpty()) {
                cola3.add(cola1.poll());
            }
            if (!cola2.isEmpty()) {
                cola3.add(cola2.poll());
            }
        }

        System.out.println("Cola 3: " + cola3);
    }
}
