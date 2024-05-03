package practicasJava2.practicasJava2;


    import java.util.List;
import java.util.ArrayList;

    class CuentaBancaria {
        private double saldo;

        public CuentaBancaria(double saldo) {
            this.saldo = saldo;
        }

        public double getSaldo() {
            return saldo;
        }
    }

    public class ListaCuenta {
        public static void main(String[] args) {
            // Crear una lista de objetos CuentaBancaria
            List<CuentaBancaria> listaCuentas = new ArrayList<>();

            // Agregar algunas cuentas a la lista
            listaCuentas.add(new CuentaBancaria(1000));
            listaCuentas.add(new CuentaBancaria(2000));
            listaCuentas.add(new CuentaBancaria(1500));
            listaCuentas.add(new CuentaBancaria(3000));

            // Calcular la suma total de los saldos
            double sumaSaldos = calcularSumaSaldos(listaCuentas);

            // Imprimir el resultado
            System.out.println("La suma total de los saldos es: " + sumaSaldos);
        }

        public static double calcularSumaSaldos(List<CuentaBancaria> listaCuentas) {
            double sumaSaldos = 0.0;

            // Iterar sobre la lista de cuentas y sumar los saldos
            for (CuentaBancaria cuenta : listaCuentas) {
                sumaSaldos += cuenta.getSaldo();
            }

            return sumaSaldos;
        }
    }


