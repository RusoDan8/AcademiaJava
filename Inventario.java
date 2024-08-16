import java.util.List;
import java.util.Map;
public interface Inventario {
    void agregarProducto(Producto producto);
    Producto obtenerProducto(String codigo);
    Map<String, Producto> obtenerTodosLosProductos();

}
