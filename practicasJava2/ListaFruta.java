package practicasJava2.practicasJava2;


    import java.util.ArrayList;
    import java.util.LinkedList;
    import java.util.List;
    import java.util.Queue;

class Fruta {
    String nombre;
    int caloriasPorPorcion;

    public Fruta(String nombre, int caloriasPorPorcion) {
        this.nombre = nombre;
        this.caloriasPorPorcion = caloriasPorPorcion;
    }
}

public class ListaFruta {
    public static void main(String[] args) {
        // Crear una lista de objetos Fruta
        List<Fruta> listaFrutas = new ArrayList<>();

        // Agregar algunas frutas a la lista
        listaFrutas.add(new Fruta("Manzana", 52));
        listaFrutas.add(new Fruta("Banana", 89));
        listaFrutas.add(new Fruta("Naranja", 47));
        listaFrutas.add(new Fruta("Kiwi", 61));
        listaFrutas.add(new Fruta("Uva", 68));

        // Filtrar las frutas con más de 50 calorías por porción
        List<Fruta> frutasConMasDe50Calorias = new ArrayList<>();
        for (Fruta fruta : listaFrutas) {
            if (fruta.caloriasPorPorcion > 50) {
                frutasConMasDe50Calorias.add(fruta);
            }
        }

        // Imprimir las frutas filtradas
        System.out.println("Frutas con más de 50 calorías por porción:");
        for (Fruta fruta : frutasConMasDe50Calorias) {
            System.out.println(fruta.nombre + " - " + fruta.caloriasPorPorcion + " calorías por porción");
        }
    }
}



