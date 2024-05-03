package practicasJava2.practicasJava2;


    import java.util.Stack;

    public class pilaSuma21 {
        public static void main(String[] args) {
            // Crear una pila de enteros
            Stack<Integer> pila = new Stack<>();

            // Agregar elementos a la pila
            pila.push(5);
            pila.push(10);
            pila.push(3);
            pila.push(7);

            // Calcular la suma de los elementos
            int suma = calcularSuma(pila);

            // Imprimir la suma
            System.out.println("La suma de los elementos de la pila es: " + suma);
        }

        public static int calcularSuma(Stack<Integer> pila) {
            int suma = 0;

            // Recorrer la pila y sumar los elementos
            for (int elemento : pila) {
                suma += elemento;
            }

            return suma;
        }
    }


