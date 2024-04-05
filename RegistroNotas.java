import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Clase Persona para representar a cada individuo.
class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase Materia para representar cada asignatura con sus notas
class Materia {
    private String nombre;
    private List<Nota> notas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    // Método para agregar una nota a la lista de notas de la materia
    public void agregarNota(Nota nota) {
        notas.add(nota);
    }
}

// Clase Nota para representar las notas de una materia
class Nota {
    private double valor;

    public Nota(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}

// Clase principal para el sistema de registro de notas
public class RegistroNotas {
    private List<Persona> personas;
    private List<Materia> materias;
    private Scanner scanner;

    public RegistroNotas() {
        this.personas = new ArrayList<>();
        this.materias = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    // Método principal para ejecutar el programa
    public void iniciar() {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    registrarPersona();
                    break;
                case 2:
                    registrarMateria();
                    break;
                case 3:
                    registrarNota();
                    break;
                case 4:
                    mostrarPersonas();
                    break;
                case 5:
                    mostrarMaterias();
                    break;
                case 6:
                    mostrarNotas();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 7);
    }

    // Método para mostrar el menú de opciones
    private void mostrarMenu() {
        System.out.println("\n=== Menú ===");
        System.out.println("1. Registrar persona");
        System.out.println("2. Registrar materia");
        System.out.println("3. Registrar nota");
        System.out.println("4. Mostrar personas");
        System.out.println("5. Mostrar materias");
        System.out.println("6. Mostrar notas");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Método para registrar una nueva persona
    private void registrarPersona() {
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();
        personas.add(new Persona(nombre));
        System.out.println("Persona registrada correctamente.");
    }

    // Método para registrar una nueva materia
    private void registrarMateria() {
        System.out.print("Ingrese el nombre de la materia: ");
        String nombre = scanner.nextLine();
        materias.add(new Materia(nombre));
        System.out.println("Materia registrada correctamente.");
    }

    // Método para registrar una nueva nota en una materia para una persona
    private void registrarNota() {
        if (personas.isEmpty() || materias.isEmpty()) {
            System.out.println("Debe haber al menos una persona y una materia registradas.");
            return;
        }

        mostrarPersonas();
        System.out.print("Seleccione el número de la persona: ");
        int numPersona = scanner.nextInt();
        if (numPersona < 1 || numPersona > personas.size()) {
            System.out.println("Número de persona inválido.");
            return;
        }
        Persona personaSeleccionada = personas.get(numPersona - 1);

        mostrarMaterias();
        System.out.print("Seleccione el número de la materia: ");
        int numMateria = scanner.nextInt();
        if (numMateria < 1 || numMateria > materias.size()) {
            System.out.println("Número de materia inválido.");
            return;
        }
        Materia materiaSeleccionada = materias.get(numMateria - 1);

        System.out.print("Ingrese la nota para " + personaSeleccionada.getNombre() + " en la materia de " + materiaSeleccionada.getNombre() + ": ");
        double valorNota = scanner.nextDouble();
        materiaSeleccionada.agregarNota(new Nota(valorNota));

        System.out.println("Nota registrada correctamente.");
    }

    // Método para mostrar la lista de personas registradas
    private void mostrarPersonas() {
        System.out.println("\nPersonas registradas:");
        for (int i = 0; i < personas.size(); i++) {
            System.out.println((i + 1) + ". " + personas.get(i).getNombre());
        }
    }

    // Método para mostrar la lista de materias registradas
    private void mostrarMaterias() {
        System.out.println("\nMaterias registradas:");
        for (int i = 0; i < materias.size(); i++) {
            System.out.println((i + 1) + ". " + materias.get(i).getNombre());
        }
    }

    // Método para mostrar las notas de una persona en una materia específica
    private void mostrarNotas() {
        if (personas.isEmpty() || materias.isEmpty()) {
            System.out.println("Debe haber al menos una persona y una materia registradas.");
            return;
        }

        mostrarPersonas();
        System.out.print("Seleccione el número de la persona: ");
        int numPersona = scanner.nextInt();
        if (numPersona < 1 || numPersona > personas.size()) {
            System.out.println("Número de persona inválido.");
            return;
        }
        Persona personaSeleccionada = personas.get(numPersona - 1);

        mostrarMaterias();
        System.out.print("Seleccione el número de la materia: ");
        int numMateria = scanner.nextInt();
        if (numMateria < 1 || numMateria > materias.size()) {
            System.out.println("Número de materia inválido.");
            return;
        }
        Materia materiaSeleccionada = materias.get(numMateria - 1);

        List<Nota> notas = materiaSeleccionada.getNotas();
        System.out.println("Notas de " + personaSeleccionada.getNombre() + " en la materia de " + materiaSeleccionada.getNombre());
        for (int i = 0; i < notas.size(); i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas.get(i).getValor());
        }
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        RegistroNotas registroNotas = new RegistroNotas();
        registroNotas.iniciar();
    }
}
