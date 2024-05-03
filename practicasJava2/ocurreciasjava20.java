package practicasJava2.practicasJava2;

    import java.util.Stack;

    public class ocurreciasjava20 {
        public static void main(String[] args) {
            // Crear una pila de cadenas de caracteres
            Stack<String> pila = new Stack<>();

            // Agregar elementos a la pila
            pila.push("hola");
            pila.push("mundo");
            pila.push("hola");
            pila.push("Java");
            pila.push("hola");

            // Cadena a eliminar
            String cadenaAEliminar = "hola";

            // Eliminar todas las ocurrencias de la cadena dada
            eliminarOcurrencias(pila, cadenaAEliminar);

            // Imprimir la pila actualizada
            System.out.println("Pila después de eliminar '" + cadenaAEliminar + "': " + pila);
        }

        public static void eliminarOcurrencias(Stack<String> pila, String cadena) {
            Stack<String> auxiliar = new Stack<>();

            // Recorrer la pila y mover los elementos diferentes a la cadena dada a una pila auxiliar
            while (!pila.isEmpty()) {
                String elemento = pila.pop();
                if (!elemento.equals(cadena)) {
                    auxiliar.push(elemento);
                }
            }

            // Revertir la pila auxiliar para restaurar el orden original
            while (!auxiliar.isEmpty()) {
                pila.push(auxiliar.pop());
            }
        }
    }


