public class Movimiento {
    private String tipo;        // ← Agrega esta línea
    private double monto;       // ← Agrega esta línea
    private String descripcion;

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