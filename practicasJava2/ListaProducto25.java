package practicasJava2.practicasJava2;


    import java.util.List;
import java.util.ArrayList;

    class Producto {
        private String nombre;
        private double precio;

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }
    }

    public class ListaProducto25 {
        public static void main(String[] args) {
            // Crear una lista de objetos Producto
            List<Producto> listaProductos = new ArrayList<>();

            // Agregar algunos productos a la lista
            listaProductos.add(new Producto("Laptop", 1200));
            listaProductos.add(new Producto("Teléfono", 800));
            listaProductos.add(new Producto("Televisor", 1500));
            listaProductos.add(new Producto("Tablet", 500));

            // Encontrar el producto con el precio más alto
            Producto productoMasCaro = encontrarProductoMasCaro(listaProductos);

            // Imprimir el producto con el precio más alto
            System.out.println("Producto con el precio más alto:");
            System.out.println("Nombre: " + productoMasCaro.getNombre());
            System.out.println("Precio: " + productoMasCaro.getPrecio());
        }

        public static Producto encontrarProductoMasCaro(List<Producto> listaProductos) {
            Producto productoMasCaro = null;
            double precioMasAlto = Double.MIN_VALUE;

            // Iterar sobre la lista de productos y encontrar el producto con el precio más alto
            for (Producto producto : listaProductos) {
                if (producto.getPrecio() > precioMasAlto) {
                    precioMasAlto = producto.getPrecio();
                    productoMasCaro = producto;
                }
            }

            return productoMasCaro;
        }
    }

