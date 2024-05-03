package practicasJava2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class laptop{
    String nombre;
    String marca;
    String tipo;
    int codigo;

    public laptop(String nombre, String marca, String tipo, int codigo) {
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "laptop{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", codigo=" + codigo +
                '}';
    }

}
public class menuLista {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<laptop> listaLaptop= new ArrayList<>();
        boolean continuar=true;
        while (continuar){
            System.out.println("Menu");
            System.out.println("1. Agregar Laptop a la lista");
            System.out.println("2. Buscar laptop por nombre");
            System.out.println("3. Eliminar laptop por codigo");
            System.out.println("4. Mostrar todas las laptops por codigo");
            System.out.println("5. Finalizar programa");
            System.out.println("Ingrese la opcion:");
            int opcion=sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la laptop: ");
                    String nombre=sc.nextLine();
                    System.out.println("Ingrese la marca de la laptop: ");
                    String marca=sc.nextLine();
                    System.out.println("Ingrese el tipo de la laptop: ");
                    String tipo=sc.nextLine();
                    System.out.println("Ingrese el codigo de la laptop: ");
                    int codigo=sc.nextInt();
                    sc.nextLine();
                    listaLaptop.add(new laptop(nombre, marca, tipo, codigo));
                    System.out.println("Laptop agregada a la lista.");
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la laptop a buscar: ");
                    String nombreBuscar=sc.nextLine();
                    System.out.println("Laptops encontradas: ");
                    boolean encontrada=false;
                    for (laptop laptop: listaLaptop){
                        if (laptop.nombre.equalsIgnoreCase(nombreBuscar)){
                            System.out.println(laptop);
                            encontrada=true;

                        }
                    }
                    if (encontrada){
                        System.out.println("No se encontraron laptops con ese nombre.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el codigo de la laptop: ");
                    int codigoEliminar=sc.nextInt();
                    sc.nextLine();
                    boolean eliminado=false;
                    for (laptop laptop:listaLaptop){
                        if (laptop.codigo== codigoEliminar){
                            listaLaptop.remove(laptop);
                            eliminado=true;
                            break;
                        }
                    }
                    if (eliminado){
                        System.out.println("Laptop eliminada de la lista.");
                    } else {
                        System.out.println("Nos e encuentra dicha laptop.");
                    }
                    break;
                case 4:
                    System.out.println("Laptops en la lista: ");
                    for (laptop laptop:listaLaptop){
                        System.out.println(laptop);
                    }
                    break;

                case 5:
                    continuar=false;
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("opcion invalida");

            }
            System.out.println();
    }
        sc.close();

}
}