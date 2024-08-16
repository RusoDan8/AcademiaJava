import java.util.HashMap;
import java.util.Map;

public class InventarioImp1 implements Inventario {
    private Map<String, Producto> productos = new HashMap<>();

    @Override
    public void agregarProducto(Producto producto){
        productos.put(producto.getCodigo(),producto);
    }
    @Override
    public Producto obtenerProducto(String codigo) {
        return productos.get(codigo);
    }
    @Override
    public Map<String,Producto> obtenerTodosLosProductos(){
        return productos;
    }
}
