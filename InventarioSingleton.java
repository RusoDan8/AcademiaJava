import java.util.HashMap;
import java.util.Map;
public class InventarioSingleton implements Inventario{
//instancia de unica clase
    private  static InventarioSingleton InstanciaUnica;
    private Map<String,Producto> productos;
    // constructor privado
    private InventarioSingleton(){
        productos = new HashMap<>();

    }
    //metodo para obtener la unica instancia
    public static InventarioSingleton obtenerInstancia(){
        if(InstanciaUnica == null){
            InstanciaUnica = new InventarioSingleton();

        }
        return InstanciaUnica;
    }

    @Override
    public void agregarProducto(Producto producto){
        productos.put(producto.getCodigo(),producto);
    }

    @Override
    public Producto obtenerProducto(String codigo) {
        return productos.get(codigo);
    }

    @Override
    public Map<String, Producto> obtenerTodosLosProductos() {
        return productos;
    }

}
