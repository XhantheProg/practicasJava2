import java.util.LinkedList;
import java.util.Queue;

public class ciclo_While_Letras {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> tempQueue = new LinkedList<>();

        // Añadir elementos a la cola
        for (int i = 1; i <= 10; i++) {
            queue.add(i);
        }

        System.out.println("Cola original: " + queue);

        // Eliminar elementos pares de la cola
        while (!queue.isEmpty()) {
            int num = queue.poll();
            if (num % 2!= 0) {
                tempQueue.add(num);
            } else {
                System.out.println("Removidos: " + num);
            }
        }

        System.out.println("Cola despues de eleminar los numeros pares: " + tempQueue);
    }
}