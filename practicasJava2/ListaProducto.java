package practicasJava2.practicasJava2;


    import java.util.List;
import java.util.ArrayList;

    class Pproducto {
        private String nombre;

        public Pproducto(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }
    }

    public class ListaProducto {
        public static void main(String[] args) {
            // Crear una lista de objetos Producto
            List<Pproducto> listaProductos = new ArrayList<>();

            // Agregar algunos productos a la lista
            listaProductos.add(new Pproducto("Laptop"));
            listaProductos.add(new Pproducto("Teléfono inteligente"));
            listaProductos.add(new Pproducto("Televisor"));
            listaProductos.add(new Pproducto("Tablet"));
            listaProductos.add(new Pproducto("Cámara digital"));

            // Encontrar el producto con el nombre más largo
            Pproducto productoConNombreMasLargo = encontrarProductoConNombreMasLargo(listaProductos);

            // Imprimir el producto con el nombre más largo
            System.out.println("Producto con el nombre más largo:");
            System.out.println("Nombre: " + productoConNombreMasLargo.getNombre());
        }

        public static Pproducto encontrarProductoConNombreMasLargo(List<Pproducto> listaProductos) {
            Pproducto productoConNombreMasLargo = null;
            int longitudMasLarga = 0;

            // Iterar sobre la lista de productos y encontrar el producto con el nombre más largo
            for (Pproducto producto : listaProductos) {
                int longitudNombre = producto.getNombre().length();
                if (longitudNombre > longitudMasLarga) {
                    longitudMasLarga = longitudNombre;
                    productoConNombreMasLargo = producto;
                }
            }

            return productoConNombreMasLargo;
        }
    }


