package practicasJava2.practicasJava2;


    import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

    class Persona implements Comparable<Persona> {
        private String nombre;

        public Persona(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        @Override
        public int compareTo(Persona otraPersona) {
            return this.nombre.compareTo(otraPersona.getNombre());
        }
    }

    public class pilalista24 {
        public static void main(String[] args) {
            // Crear una lista de objetos Persona
            List<Persona> listaPersonas = new ArrayList<>();

            // Agregar algunas personas a la lista
            listaPersonas.add(new Persona("Juan"));
            listaPersonas.add(new Persona("Alejandro"));
            listaPersonas.add(new Persona("Manuel"));


            // Ordenar la lista alfabéticamente por nombre
            Collections.sort(listaPersonas);

            // Mostrar la lista ordenada
            System.out.println("Lista ordenada alfabéticamente por nombre:");
            for (Persona persona : listaPersonas) {
                System.out.println(persona.getNombre());
            }
        }
    }


