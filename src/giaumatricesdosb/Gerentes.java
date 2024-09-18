
package giaumatricesdosb;

// Clase base Empleado
class Empleado {
    // Atributos de la clase base
    protected String nombre;
    protected double salarioBase;

    // Constructor para inicializar los atributos de Empleado
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Métodos getter y setter para los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Método toString para imprimir la información del empleado
    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre='" + nombre + '\'' +
                ", Salario Base=" + salarioBase +
                '}';
    }
}

// Subclase Gerente que hereda de Empleado
class Gerente extends Empleado {
    // Atributos adicionales de la clase Gerente
    private double bonificacion;
    private double salarioTotal;

    // Constructor para inicializar los atributos de Gerente y Empleado
    public Gerente(String nombre, double salarioBase, double bonificacion) {
        super(nombre, salarioBase); // Llamada al constructor de la clase base
        this.bonificacion = bonificacion;
        this.salarioTotal = salarioBase + bonificacion;
    }

    // Métodos getter y setter para los atributos adicionales
    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
        this.salarioTotal = this.salarioBase + bonificacion; // Recalcular el salario total
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }

    // Sobrescribir el método toString para incluir la información del gerente
    @Override
    public String toString() {
        return "Gerente{" +
                "Nombre='" + nombre + '\'' +
                ", Salario Base=" + salarioBase +
                ", Bonificación=" + bonificacion +
                ", Salario Total=" + salarioTotal +
                '}';
    }
}

// Clase principal para probar Empleado y Gerente
public class Gerentes {
    public static void main(String[] args) {
        // Instanciar objetos de la clase Gerente
        Gerente gerente1 = new Gerente("Ana López", 5000, 1500);
        Gerente gerente2 = new Gerente("Carlos Pérez", 7000, 2000);

        // Imprimir los detalles de los gerentes
        System.out.println(gerente1);
        System.out.println(gerente2);
    }
}
