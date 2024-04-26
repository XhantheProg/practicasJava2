import java.util.LinkedList;
import java.util.Queue;

class Color {
    private String nombre;

    public Color(String nombre) {
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

public class agregar_Colores {
    public static void main(String[] args) {
        Queue<Color> queue = new LinkedList<>();

        // Añade colores a ala cola
        queue.add(new Color("rojo"));
        queue.add(new Color("verde"));
        queue.add(new Color("azul"));
        queue.add(new Color("amarillo"));

        // Remueve los elementos "rojo" y "amarillo" de la cola
        while (!queue.isEmpty()) {
            Color color = queue.peek();
            if (color.getnombre().equals("rojo") || color.getnombre().equals("amarillo")) {
                queue.poll();
            } else {
                break;
            }
        }

        // Imprime los elementos restantes de la cola
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}