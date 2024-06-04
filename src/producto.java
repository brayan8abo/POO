import java.util.Date;

public class Producto {
    private String nombre;
    private double precio;
    private Date fechaCompra;

    public Producto(String nombre, double precio, Date fechaCompra) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaCompra = fechaCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", fechaCompra=" + fechaCompra +
                '}';
    }
}