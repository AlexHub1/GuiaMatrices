
package giaumatricesdosb;

class Pelicula{
    String título;
    String director;
    String ano;
    String genero;
    
    public Pelicula(String título,String director,String ano,String genero){
        this.título = título;        
        this.director = director;
        this.ano = ano;
        this.genero = genero;
    }
    
    public String getTitulo(){
        
        return título;
    }
    
    public void setTitulo(String title){
        this.título = title; 
    }
    
    public String getDirector(){
        
        return director;
    }
    
    public void setDirector(String director){
        
        this.director = director;
    }
    
    public String getAno(){
        
        return ano;
    }
    
    public void setAno(String year){
        
        this.ano = year;
    }
    
    public String getGenero(){
        
        return genero;
    }
    
    public void setGenero(String gen){
        
        this.genero = gen;
    }
    @Override
    
    // el formato en el que quiero que se imprima 
    public String toString(){
        
        return "Película{" +
                "Título='" + título + '\'' +
                ", Director='" + director + '\'' +
                ", Año=" + ano +
                ", Género='" + genero + '\'' +
                '}';
    }
}

public class GuiaDosDos {
    public static void main(String[] args) {
        
        /*11. Crea una clase llamada Película con los siguientes atributos:
        • Título
        • Director
        • Año
        • Género
        Implementa los métodos setter y getter, un constructor para inicializar todos los atributos
        y un método toString que imprima la información de la película. Instancia varios objetos y
        muestra sus valores*/
        
        Pelicula [] peliculas ={
            
            new Pelicula("El gran gatsby","nose","2010","romance"),
            new Pelicula("Comer Rezar Amar","nose","2012","romance"),
            new Pelicula("KILL BILL","Quentin Tarantino","2000","Thiller")
        };
        
        for (Pelicula p : peliculas ) {
            System.out.println(p.toString());
        }
        
    }
}
