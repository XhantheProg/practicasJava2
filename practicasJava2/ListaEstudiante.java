package practicasJava2.practicasJava2;


    import java.util.List;
import java.util.ArrayList;

    class Estudiante {
        private String nombre;
        private List<Double> calificaciones;

        public Estudiante(String nombre, List<Double> calificaciones) {
            this.nombre = nombre;
            this.calificaciones = calificaciones;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPromedio() {
            if (calificaciones.isEmpty()) {
                return 0.0;
            }

            double suma = 0.0;
            for (double calificacion : calificaciones) {
                suma += calificacion;
            }
            return suma / calificaciones.size();
        }
    }

    public class ListaEstudiante {
        public static void main(String[] args) {
            // Crear una lista de objetos Estudiante
            List<Estudiante> listaEstudiantes = new ArrayList<>();

            // Agregar algunos estudiantes a la lista
            List<Double> calificacionesJuan = new ArrayList<>();
            calificacionesJuan.add(85.0);
            calificacionesJuan.add(90.0);
            calificacionesJuan.add(95.0);
            listaEstudiantes.add(new Estudiante("Juan", calificacionesJuan));

            List<Double> calificacionesMaria = new ArrayList<>();
            calificacionesMaria.add(90.0);
            calificacionesMaria.add(92.0);
            calificacionesMaria.add(88.0);
            listaEstudiantes.add(new Estudiante("Maria", calificacionesMaria));

            List<Double> calificacionesPedro = new ArrayList<>();
            calificacionesPedro.add(80.0);
            calificacionesPedro.add(85.0);
            calificacionesPedro.add(90.0);
            listaEstudiantes.add(new Estudiante("Pedro", calificacionesPedro));

            // Encontrar el estudiante con el promedio más alto
            Estudiante estudianteConPromedioMasAlto = encontrarEstudianteConPromedioMasAlto(listaEstudiantes);

            // Imprimir el estudiante con el promedio más alto
            System.out.println("Estudiante con el promedio más alto:");
            System.out.println("Nombre: " + estudianteConPromedioMasAlto.getNombre());
            System.out.println("Promedio: " + estudianteConPromedioMasAlto.getPromedio());
        }

        public static Estudiante encontrarEstudianteConPromedioMasAlto(List<Estudiante> listaEstudiantes) {
            Estudiante estudianteConPromedioMasAlto = null;
            double promedioMasAlto = Double.MIN_VALUE;

            // Iterar sobre la lista de estudiantes y encontrar el estudiante con el promedio más alto
            for (Estudiante estudiante : listaEstudiantes) {
                double promedio = estudiante.getPromedio();
                if (promedio > promedioMasAlto) {
                    promedioMasAlto = promedio;
                    estudianteConPromedioMasAlto = estudiante;
                }
            }

            return estudianteConPromedioMasAlto;
        }
    }


