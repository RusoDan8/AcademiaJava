// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       // creamos la instancia del inventario
        Inventario inventario = new InventarioImp1();

        //se crea la caja con el inventario inyectado
        CajaRegistradora caja = CajaRegistradora.obtenerCaja(inventario);

        caja.mensajeCaja();

        //CReamos productos
        Fruta manzana = new Fruta("F001","Manzana",2.5);
        Abarrotes leche = new Abarrotes("A001", "leche" ,3.5);

        //registramos los productos en la caja
        caja.RegistroProducto(manzana);
        caja.RegistroProducto(leche);

        //mostramos el inventario
        caja.mostrarInventario();

        //simulamos el inventario
        caja.mostrarInventario();

        //simulacion de ventas
        caja.cobrar("F001", 5);
        caja.cobrar("A001", 2);

    }
}