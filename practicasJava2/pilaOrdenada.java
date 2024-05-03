package practicasJava2.practicasJava2;


    import java.util.Stack;
import java.util.Collections;

    public class pilaOrdenada {
        public static void main(String[] args) {
            // Crear una pila de cadenas de caracteres
            Stack<String> pila = new Stack<>();

            // Agregar elementos a la pila
            pila.push("zorro");
            pila.push("gato");
            pila.push("perro");
            pila.push("elefante");

            // Ordenar la pila en orden alfabético
            ordenarPila(pila);

            // Imprimir la pila ordenada
            System.out.println("Pila ordenada:");
            while (!pila.isEmpty()) {
                System.out.println(pila.pop());
            }
        }

        public static void ordenarPila(Stack<String> pila) {
            // Convertir la pila en una lista para poder ordenarla
            Collections.sort(pila);
        }
    }


