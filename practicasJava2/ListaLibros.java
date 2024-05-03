package practicasJava2.practicasJava2;


    import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

    class Libro implements Comparable<Libro> {
        private String autor;
        private String titulo;

        public Libro(String autor, String titulo) {
            this.autor = autor;
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public String getTitulo() {
            return titulo;
        }

        @Override
        public int compareTo(Libro otroLibro) {
            // Primero, ordenar por autor
            int comparacionAutor = this.autor.compareTo(otroLibro.getAutor());
            if (comparacionAutor != 0) {
                return comparacionAutor;
            }
            // Si los autores son iguales, ordenar por título
            return this.titulo.compareTo(otroLibro.getTitulo());
        }

        @Override
        public String toString() {
            return "Libro{" +
                    "autor='" + autor + '\'' +
                    ", titulo='" + titulo + '\'' +
                    '}';
        }
    }

    public class ListaLibros {
        public static void main(String[] args) {
            // Crear una lista de objetos Libro
            List<Libro> listaLibros = new ArrayList<>();

            // Agregar algunos libros a la lista
            listaLibros.add(new Libro("Stephen King", "El Resplandor"));
            listaLibros.add(new Libro("J.K. Rowling", "Harry Potter y la Piedra Filosofal"));
            listaLibros.add(new Libro("Stephen King", "It"));
            listaLibros.add(new Libro("J.R.R. Tolkien", "El Señor de los Anillos"));

            // Ordenar la lista por autor y luego por título
            Collections.sort(listaLibros);

            // Imprimir la lista ordenada
            System.out.println("Lista de libros ordenada por autor y luego por título:");
            for (Libro libro : listaLibros) {
                System.out.println(libro);
            }
        }
    }


