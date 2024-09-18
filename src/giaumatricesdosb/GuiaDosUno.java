
package giaumatricesdosb;

class Libro{
    
    String ISBN;
    String titulo;
    String autor;
    String disponible;
    
    public Libro(String ISBN,String titulo,String autor,String disponible){
     
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;   
    }
    
    public void imprimirConsola(){
        
        System.out.println("ISBN: "+ ISBN);
        System.out.println("Titulo: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("disponible: "+ disponible);
    }
} 

public class GuiaDosUno {
    
    public static void main(String[] args) {
       
        Libro libros = new Libro ("123","1984","Gorge Orwell","SI");
        libros.imprimirConsola();
        
//        Libro[] libros = {
//            new Libro("978-3-16-148410-0", "El Gran Libro", "Juan Pérez", true),
//            new Libro("978-0-596-52068-7", "Java para todos", "Maria Gómez", false),
//            new Libro("978-1-4028-9462-6", "Programación Avanzada", "Luis Martínez", true)
//        };
//
//        // Imprimir los detalles de todos los libros
//        for (Libro libro : libros) {
//            libro.imprimirDetalles();
//        }
    }
}
