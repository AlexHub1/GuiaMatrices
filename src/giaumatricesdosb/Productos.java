
package giaumatricesdosb;

class Venta{
    
    String producto;
    int cantidad;
    Double precioUnitario;
    Double precioTotal;
    
    public Venta(String producto,int cantidad,Double precioUnitario){
       
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precioTotal = obtenerTotal();
    }
    
    private Double obtenerTotal(){
        
        return this.cantidad * this.precioUnitario;
    } 
    
    public String getProducto(){
        return producto;
    }
    
    public void setProducto(String product){
       this.producto = product;
       this.precioTotal = obtenerTotal();
    }
    @Override
    public String toString(){
        return "Venta {"+
                "Producto -> " + producto +
                "Cantidad -> " + cantidad +
                "Precio Unitario -> " + precioUnitario +
                "Precio Total -> " + precioTotal + "}";
    }
}

public class Productos {
    public static void main(String[] args) {
        
        /*21. Crea una clase llamada Venta con los siguientes atributos:
        • Producto
        • Cantidad
        • Precio unitario
        • Precio total (calculado como cantidad * precio unitario)
        Implementa los métodos setter y getter, un constructor para inicializar todos los atributos
        excepto precio total, que se calculará automáticamente, y un método toString que imprima
        la información de la venta. Instancia varios objetos y muestra sus valores.*/
        
        Venta [] ventas = {
            new Venta ("Leche",20,560.00),
            new Venta ("Chocolate",30,500.00),
            new Venta ("Maiz",29,530.20),
            new Venta ("Huevos",33,600.00)
        };
        for (Venta v : ventas ) {
            System.out.println(v.toString());   
        }
        
    }
 
}
