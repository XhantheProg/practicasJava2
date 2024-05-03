package practicasJava2.out.production.practicaj2;
import java.util.Stack;
public class pila_valor_min_max {



        public static void main(String[] args) {
            // Crear una pila de enteros
            Stack<Integer> pila = new Stack<>();

            // Agregar elementos a la pila
            pila.push(10);
            pila.push(5);
            pila.push(8);
            pila.push(15);
            pila.push(3);

            // Encontrar el número máximo y mínimo en la pila
            int maximo = encontrarMaximo(pila);
            int minimo = encontrarMinimo(pila);

            // Imprimir el resultado
            System.out.println("Número máximo en la pila: " + maximo);
            System.out.println("Número mínimo en la pila: " + minimo);
        }

        public static int encontrarMaximo(Stack<Integer> pila) {
            int maximo = Integer.MIN_VALUE; // Inicializar el máximo como el valor mínimo posible para enteros

            // Recorrer la pila y actualizar el máximo si se encuentra un valor mayor
            for (int elemento : pila) {
                if (elemento > maximo) {
                    maximo = elemento;
                }
            }

            return maximo;
        }

        public static int encontrarMinimo(Stack<Integer> pila) {
            int minimo = Integer.MAX_VALUE; // Inicializar el mínimo como el valor máximo posible para enteros

            // Recorrer la pila y actualizar el mínimo si se encuentra un valor menor
            for (int elemento : pila) {
                if (elemento < minimo) {
                    minimo = elemento;
                }
            }

            return minimo;
        }
    }


