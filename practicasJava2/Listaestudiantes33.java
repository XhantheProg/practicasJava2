package practicasJava2.practicasJava2;


    import java.util.ArrayList;
import java.util.List;

    class estudiante {
        String nombre;
        double puntos;

        public estudiante(String nombre, double puntos) {
            this.nombre = nombre;
            this.puntos = puntos;
        }
    }

    public class Listaestudiantes33 {
        public static void main(String[] args) {
            // Crear una lista de objetos Estudiante
            List<estudiante> listaEstudiantes = new ArrayList<>();

            // Agregar algunos estudiantes a la lista
            listaEstudiantes.add(new estudiante("Juan", 7.5));
            listaEstudiantes.add(new estudiante("María", 6.0));
            listaEstudiantes.add(new estudiante("Pedro", 4.8));
            listaEstudiantes.add(new estudiante("Ana", 8.9));
            listaEstudiantes.add(new estudiante("Carlos", 5.5));

            // Filtrar los estudiantes con más de 5.0 puntos
            List<estudiante> estudiantesConMasDe5Puntos = new ArrayList<>();
            for (estudiante estudiante : listaEstudiantes) {
                if (estudiante.puntos > 5.0) {
                    estudiantesConMasDe5Puntos.add(estudiante);
                }
            }

            // Imprimir los estudiantes filtrados
            System.out.println("Estudiantes con más de 5.0 puntos:");
            for (estudiante estudiante : estudiantesConMasDe5Puntos) {
                System.out.println(estudiante.nombre + " - " + estudiante.puntos + " puntos");
            }
        }
    }


