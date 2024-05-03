package practicasJava2.practicasJava2;


    import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

    class Animal {
        private String especie;

        public Animal(String especie) {
            this.especie = especie;
        }

        public String getEspecie() {
            return especie;
        }
    }

    public class ListaAnimales26 {
        public static void main(String[] args) {
            // Crear una lista de objetos Animal
            List<Animal> listaAnimales = new ArrayList<>();

            // Agregar algunos animales a la lista
            listaAnimales.add(new Animal("Perro"));
            listaAnimales.add(new Animal("Gato"));
            listaAnimales.add(new Animal("Perro"));
            listaAnimales.add(new Animal("Gato"));
            listaAnimales.add(new Animal("Perro"));
            listaAnimales.add(new Animal("Gato"));
            listaAnimales.add(new Animal("Pájaro"));
            listaAnimales.add(new Animal("Pájaro"));

            // Contar cuántos animales de cada especie hay en la lista
            Map<String, Integer> conteoAnimales = contarAnimales(listaAnimales);

            // Imprimir el resultado
            System.out.println("Cantidad de animales de cada especie:");
            for (Map.Entry<String, Integer> entry : conteoAnimales.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        public static Map<String, Integer> contarAnimales(List<Animal> listaAnimales) {
            Map<String, Integer> conteoAnimales = new HashMap<>();

            // Iterar sobre la lista de animales y contar cuántos hay de cada especie
            for (Animal animal : listaAnimales) {
                String especie = animal.getEspecie();
                conteoAnimales.put(especie, conteoAnimales.getOrDefault(especie, 0) + 1);
            }

            return conteoAnimales;
        }
    }


