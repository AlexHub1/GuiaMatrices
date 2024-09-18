
package giaumatricesdosb;

class Cliente {
    // Atributos con modificador de acceso predeterminado
    String nombre;
    String direccion;
    String telefono;

    // Constructor para inicializar los atributos
    public Cliente(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Métodos para establecer y obtener los valores de los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    // Método toString para mostrar la información del cliente
    @Override
    public String toString() {
        return "Cliente{" +
                "Nombre='" + nombre + '\'' +
                ", Dirección='" + direccion + '\'' +
                ", Teléfono='" + telefono + '\'' +
                '}';
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear un objeto Cliente
        Cliente cliente = new Cliente("Juan Pérez", "Calle Falsa 123", "555-1234");

        // Imprimir los detalles del cliente
        System.out.println(cliente.toString());

        // Cambiar algunos atributos y mostrar nuevamente los detalles
        cliente.setDireccion("Avenida Siempre Viva 742");
        System.out.println(cliente.toString());
    }
}



public class ModificadorAceso {
    
}
