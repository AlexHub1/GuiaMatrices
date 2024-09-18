
package giaumatricesdosb;
class Producto {
    // Atributos protegidos
    protected String codigo;
    protected String nombre;
    protected double precio;

    // Constructor para inicializar los atributos
    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Métodos getter y setter para acceder y modificar los valores de los atributos
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método para aplicar un descuento al precio
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            this.precio -= this.precio * (porcentaje / 100);
        } else {
            System.out.println("Porcentaje de descuento no válido.");
        }
    }

    // Método para imprimir los detalles del producto
    public void imprimirDetalles() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
    }
}    
public class ProductoB {
    public static void main(String[] args) {
       
         Producto producto = new Producto("P001", "Laptop", 1000.00);

        
        producto.imprimirDetalles();

        // Aplicar un descuento del 10%
        producto.aplicarDescuento(10);

        
        producto.imprimirDetalles();
    }
  
}
