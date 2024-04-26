import java.util.LinkedList;
import java.util.Queue;

public class suma_Impares {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Añadir elementos en la cola
        for (int i = 1; i <= 10; i++) {
            queue.add(i);
        }

        System.out.println("Original queue: " + queue);

        // Suma los elementos impares a la cola
        int sum = 0;
        int n=queue.size();
        for (int i = 0; i < n; i++) {
            int num = queue.poll();
            if (num % 2 != 0) {
                sum += num;
            } else {
                queue.offer(num);
            }
        }

        System.out.println("Suma los elementos impares de la cola: " + sum);

    }
}