import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Queue<String> Cola = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelecciona una opcion:");
            System.out.println("1. Añade persona a la cola");
            System.out.println("2. Remueve una persona de la cola");
            System.out.println("3. Mostrar la cola");
            System.out.println("4. Salir");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Pon el nombre:");
                    String name = scanner.next();
                    Cola.add(name);
                    break;
                case 2:
                    if (!Cola.isEmpty()) {
                        System.out.println("Removido: " + Cola.poll());
                    } else {
                        System.out.println("La cola esta vacia.");
                    }
                    break;
                case 3:
                    System.out.println("Cola: " + Cola);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opcion invalida.");
            }
        }
    }
}
