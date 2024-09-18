
package giaumatricesdosb;

class Empleado {
    
    private String nombre;
    private Double salario;
    
    public Empleado(String nombre, Double salary){
        this.nombre = nombre;
        this.salario = salary;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nom){
        this.nombre = nom;
    }
    
    public Double getSalario(){
        return salario;
    }
    
    public void setSalario(Double sala){
        this.salario = sala;
    }
    
    public Double salarioAnual(){
        
        return this.salario * 12;
    }
    
    public void imprimirDetalles(){
        
        System.out.println("Nombre: "+ nombre);
        System.out.println("Salario: "+ salario);
        System.out.println("Salario Anual: " + salarioAnual());
    } 
}
//public class Empleado {
//    public static void main(String[] args) {
//      /*31. Crea una clase llamada Empleado con los siguientes atributos privados:
//        • nombre (String)
//        • salario (double)
//        Implementa métodos públicos para establecer y obtener los valores de estos atributos,
//        además de un método para calcular el salario anual.*/  
//      
//        EmpleadosZ [] employee ={
//           new  EmpleadosZ("Sara",500000.20),
//           new  EmpleadosZ("Emily",550000.25)
//        } ;
//        
//        for (EmpleadosZ e : employee) {
//          e.imprimirDetalles();
//        }
//        
//        employee[0].setSalario(200.30);
//        employee[0].imprimirDetalles();
//        
//    }
// 
//}
