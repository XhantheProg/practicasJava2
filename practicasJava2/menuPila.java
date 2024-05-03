package practicasJava2;

import java.util.Scanner;
import java.util.Stack;

class libro{
    String nombre;
    String autor;
    String categoria;

    public libro(String nombre, String autor, String categoria) {
        this.nombre = nombre;
        this.autor = autor;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "libro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}

public class menuPila {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<libro> pilaLibros=new Stack<>();
        boolean continuar=true;
        while (continuar){
            System.out.println("Menu");
            System.out.println("1. Agregar Libro a la pila");
            System.out.println("2. Mostar tamaño de la pila");
            System.out.println("3. Mostar ultimo libro de la pila");
            System.out.println("4. Librerar la pila");
            System.out.println("5. Finalizar programa");
            System.out.println("Ingrese la opcion:");
            int opcion=sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre del libro:");
                    String nombre=sc.nextLine();
                    System.out.println("Ingrese el autor del libro");
                    String autor=sc.nextLine();
                    System.out.println("ingrese la categoria del libro");
                    String categoria=sc.nextLine();

                    pilaLibros.push(new libro(nombre, autor, categoria));
                    System.out.println(new libro(nombre, autor, categoria));
                    System.out.println("Libro agregado a la pila");
                    break;
                case 2:
                    System.out.println("Tamaño de la pila de libros: " + pilaLibros.size());
                    break;
                case 3:
                    if (!pilaLibros.isEmpty()){
                        System.out.println("Ultimo libro en la pila:");
                        System.out.println(pilaLibros.peek());
                    } else {
                        System.out.println("La pila de libros esta vacia");
                    }
                    break;
                case 4:
                    pilaLibros.clear();
                    System.out.println("La pila de libros ha sido liberada");
                    break;
                case 5:
                    continuar=false;
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opcion invalida.");

            }
            System.out.println();

        }
        sc.close();
    }

}
