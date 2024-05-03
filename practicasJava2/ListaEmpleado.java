package practicasJava2.practicasJava2;


    import java.util.List;
import java.util.ArrayList;

    class empleado {
        private double salario;

        public empleado(double salario) {
            this.salario = salario;
        }

        public double getSalario() {
            return salario;
        }
    }

    public class ListaEmpleado {
        public static void main(String[] args) {
            // Crear una lista de objetos Empleado
            List<empleado> listaEmpleados = new ArrayList<>();

            // Agregar algunos empleados a la lista
            listaEmpleados.add(new empleado(2500));
            listaEmpleados.add(new empleado(3000));
            listaEmpleados.add(new empleado(2000));
            listaEmpleados.add(new empleado(3500));
            listaEmpleados.add(new empleado(4000));

            // Calcular el salario promedio
            double salarioPromedio = calcularSalarioPromedio(listaEmpleados);

            // Imprimir el salario promedio
            System.out.println("El salario promedio de los empleados es: " + salarioPromedio);
        }

        public static double calcularSalarioPromedio(List<empleado> listaEmpleados) {
            double sumaSalarios = 0.0;

            // Iterar sobre la lista de empleados y sumar los salarios
            for (empleado empleado : listaEmpleados) {
                sumaSalarios += empleado.getSalario();
            }

            // Calcular el promedio dividiendo la suma de los salarios por el número de empleados
            return sumaSalarios / listaEmpleados.size();
        }
    }

