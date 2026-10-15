import java.text.DecimalFormat;

public class Billetera {
    private double saldo;
    private Movimiento[] movimientos;
    private int contador;
    private DecimalFormat formato = new DecimalFormat("#,##0.00");

    public Billetera(int capacidadMaxima) {
        saldo = 0;
        movimientos = new Movimiento[capacidadMaxima];
        contador = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean registrarIngreso(double monto, String descripcion) {
        if (monto <= 0 || contador >= movimientos.length) {
            return false;
        }
        saldo += monto;
        movimientos[contador] = new Movimiento("Ingreso", monto, descripcion);
        contador++;
        return true;
    }

    public boolean registrarGasto(double monto, String descripcion) {
        if (monto <= 0 || monto > saldo || contador >= movimientos.length) {
            return false;
        }
        saldo -= monto;
        movimientos[contador] = new Movimiento("Gasto", monto, descripcion);
        contador++;
        return true;
    }

    public void mostrarMovimientos() {
        System.out.println("\n=== Historial de Movimientos ===");
        if (contador == 0) {
            System.out.println("Sin movimientos registrados.");
            return;
        }
        for (int i = 0; i < contador; i++) {
            Movimiento m = movimientos[i];
            System.out.println((i + 1) + ". " + m.getTipo() +
                             " — $" + formato.format(m.getMonto()) +
                             " | " + m.getDescripcion());
        }
        System.out.println("==================================");
        System.out.println("Saldo actual: $" + formato.format(getSaldo())); // ✅ Usamos el método
    }
}