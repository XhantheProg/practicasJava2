package practicasJava2.practicasJava2;
    import java.util.Stack;

    class Empleado {
        private String nombre;
        private double salario;

        public Empleado(String nombre, double salario) {
            this.nombre = nombre;
            this.salario = salario;
        }

        public String getNombre() {
            return nombre;
        }

        public double getSalario() {
            return salario;
        }
    }

    public class PilaEmpleado {
        public static void main(String[] args) {
            // Crear una pila de objetos de tipo Empleado
            Stack<Empleado> pilaEmpleados = new Stack<>();

            // Agregar algunos empleados a la pila
            pilaEmpleados.push(new Empleado("Juan", 2500));
            pilaEmpleados.push(new Empleado("María", 3000));
            pilaEmpleados.push(new Empleado("Pedro", 2000));
            pilaEmpleados.push(new Empleado("Ana", 3500));
            pilaEmpleados.push(new Empleado("Carlos", 4000));

            // Valor dado para comparar con los salarios
            double salarioMinimo = 3000;

            // Mostrar los nombres de los empleados con salario mayor que el valor dado
            System.out.println("Empleados con salario mayor que $" + salarioMinimo + ":");
            for (Empleado empleado : pilaEmpleados) {
                if (empleado.getSalario() > salarioMinimo) {
                    System.out.println(empleado.getNombre());
                }
            }
        }
    }


