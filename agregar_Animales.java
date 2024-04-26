import java.util.LinkedList;
import java.util.Queue;

class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getnombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

public class agregar_Animales {
    public static void main(String[] args) {
        Queue<Animal> queue = new LinkedList<>();

        // Add animals to the queue
        queue.add(new Animal("perro"));
        queue.add(new Animal("gato"));
        queue.add(new Animal("conejo"));
        queue.add(new Animal("loro"));

        // Remueve el conejo de la cola
        while (!queue.isEmpty() && !queue.peek().getnombre().equals("conejo")) {
            queue.poll();
        }

        // Remueve el conejo de la cola
        if (!queue.isEmpty()) {
            queue.poll();
        }

        // Imprime los elementos restantes de la cola
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}