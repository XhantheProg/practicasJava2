import java.util.Scanner;
import java.util.Stack;

class Person {
    private String nombre;
    private int edad;

    public Person(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getnombre() {
        return nombre;
    }

    public int getedad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", Edad=" + edad + "]";
    }
}

public class pila_Persona {
    public static void main(String[] args) {
        Stack<Person> pila = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        // Añade elementos en la pila
        pila.push(new Person("Alice", 30));
        pila.push(new Person("Bob", 25));
        pila.push(new Person("Charlie", 20));

        System.out.println("Pila: " + pila);

        System.out.println("Mostar la informacion de cada persona en la pila:");
        while (!pila.isEmpty()) {
            Person person = pila.pop();
            System.out.println(person);
        }
    }
}