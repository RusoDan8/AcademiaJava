import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class CajaRegistradora {
    //caja registradora
    private static CajaRegistradora unicaCaja;
    private Inventario inventario;

    // constructor privado de la caja
    private CajaRegistradora(Inventario inventario){
       this.inventario = inventario;
    }

    //metodo para obtener la unica caja registadora
    public static CajaRegistradora obtenerCaja(Inventario inventario){
        //si aun no hay caja aqui se hace
        if(unicaCaja==null){
            unicaCaja = new CajaRegistradora(inventario);
        }
        return unicaCaja;
    }
    // registro para agragar productos al invetario
    public void RegistroProducto(Producto producto){
        inventario.agregarProducto(producto);
    }


    //metodo para cobrar segun el producto sea abarrote o fruta
    public double cobrar(String codigo, double cantidad){
        Producto producto = inventario.obtenerProducto(codigo);
        if(producto == null){
            System.out.println("producto no encontrado");
            return 0;
        }

        double total;

        if(producto instanceof Fruta){ // la fruta se cobra por kilo
            total = producto.getPrecio() * cantidad;
        } else if (producto instanceof Abarrotes) { // se cobra por pieza
            total = producto.getPrecio() * cantidad;

        } else {
            System.out.println("Error");
            return 0;
        }
        System.out.println("total a pagar por " + producto.getNombre() + ": $" + total);
        return total;
    }
    //muestra todos los productos registrados
    public void mostrarInventario(){
        System.out.println("Inventario: ");
        for (Producto producto :inventario.obtenerTodosLosProductos().values()){
            System.out.println(producto);
        }
    }
    // la caja en si
    public void mensajeCaja(){
        System.out.println("Bienevenido a la caja");
    }
}
