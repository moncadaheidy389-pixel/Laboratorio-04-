public class Movimiento {
    // ← Agrega estas 3 líneas que faltan arriba de todo
    private String tipo;
    private double monto;
    private String descripcion;

    // ← Tu constructor debe estar así
    public Movimiento(String tipo, double monto, String descripcion) {
        this.tipo = tipo;
        this.monto = monto;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public double getMonto() {
        return monto;
    }

    public String getDescripcion() {
        return descripcion;
    }
}