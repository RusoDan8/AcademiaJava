public class Producto { // esta es la clase de donde se registran lo productos

    private String codigo;
    private String nombre;
    private double precio;

    //constructor
    public Producto(String codigo, String nombre, double precio){
        this.codigo=codigo;
        this.nombre=nombre;
        this.precio=precio;
    }
    //metodo para generar el codigo del producto
    public String getCodigo(){
        return codigo;
    }
    // metodo para generar el nombre del producto
    public String getNombre(){
        return nombre;
    }
    // metodo para generar el precio del producto
    public double getPrecio(){
        return precio;
    }
    // metodo para mostrar la info del producto
    @Override
    public String toString(){
        return codigo + ":" + nombre + " - $" + precio;
    }
}
