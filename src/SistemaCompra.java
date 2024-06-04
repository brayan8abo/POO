import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SistemaCompra {
    private List<Producto> productos;

    public SistemaCompra() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void ordenarPorFecha() {
        Collections.sort(productos, Comparator.comparing(Producto::getFechaCompra));
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}