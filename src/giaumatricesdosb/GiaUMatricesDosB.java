
package giaumatricesdosb;

import java.text.*;
import java.time.LocalDate;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
import javax.swing.*;

class infoReserva{
    
    String nombre;
    String apellido;
    String cedula;
    String numeroHabitacion;
    Date fechaEntrada;
    Date fechaSalida;
    
    public infoReserva(String nomb,String apellido,String cedula,String numeroHabitacion,String fechaEntrada,String fechaSalida){
      
      this.nombre = nomb;
      this.apellido = apellido;
      this.cedula = cedula;
      this.numeroHabitacion = numeroHabitacion;
      this.fechaEntrada = transformarDate(fechaEntrada);
      this.fechaSalida = transformarDate(fechaSalida);
        
    }
    
    public static Date transformarDate(String fecha){
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            return formatoFecha.parse(fecha);
            
        } catch (ParseException e) {
            
            return null;
        }
    }
    
}

public class GiaUMatricesDosB {
    
    public static infoReserva [][] reservas;
    public static int cantidadReservas = 0;
    public static int [] costoEstancia ;
    public static int cantidadInicialHuespedes =0;
    public static void main(String[] args) {
        
        /*35. Desarrolla un programa en Java que permita gestionar las reservas de un
        hotel. El programa debe:
        1. Solicitar la información básica de cada huésped (nombre, apellido, cédula,
        número de habitación, fecha de entrada, fecha de salida).
        2. Permitir registrar nuevas reservas y cancelar reservas existentes.
        3. Calcular el costo total de la estancia basada en la cantidad de noches y el
        precio por noche.
        4. Mostrar la información detallada de cada reserva, incluyendo el costo total de
        la estancia.*/
        
        cantidadInicialHuespedes = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de huespedes a ingresar"));
        reservas = new infoReserva[cantidadInicialHuespedes][1];
        costoEstancia = new int [reservas.length];
        for (int i = 0; i < cantidadInicialHuespedes; i++) {
            
           String nombreHuesped = (String) JOptionPane.showInputDialog("Digite el nombre del huesped");
           String apellidoHuesped = (String) JOptionPane.showInputDialog("Digite el apellido del huesped"); 
           String cedulaHuesped = (String) JOptionPane.showInputDialog("Digite el cedula del huesped"); 
           String habitacionHuesped = (String) JOptionPane.showInputDialog("Digite el Habitacion del huesped"); 
           String entradaHuesped = (String) JOptionPane.showInputDialog("Digite el fecha de ENTRADA del huesped en formato dd/MM/yyyy"); 
           String salidaHuesped = (String) JOptionPane.showInputDialog("Digite el fecha de SALIDA del huesped en formato dd/MM/yyyy"); 
           
           infoReserva info = new infoReserva(
                   
               nombreHuesped,
               apellidoHuesped,
               cedulaHuesped,
               habitacionHuesped,
               entradaHuesped,
               salidaHuesped    
           );
           
           reservas[i][0] = info;
           
           cantidadReservas ++;
        }
        
       servicios(); 
    }
    
    public static class DateUtils {
        
        public static LocalDate convertirADate(Date date) {
            
            return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
    }
    
    public static void servicios(){
        
        String [] servicios = {"registrar nuevas reservas","cancelar reservas existentes","costo total de la estancia","información detallada de cada reserva"};
        String seleccionS =(String)JOptionPane.showInputDialog(null,"Seleccione el servicio que desea","SERVICIOS",JOptionPane.QUESTION_MESSAGE,null,servicios,servicios[0]);
        
        switch (seleccionS) {
            case "registrar nuevas reservas":
                registrarNuevasReservas();
                break;
            case "cancelar reservas existentes":
                cancelaReservas(posicionReserva());
                break;
            case "costo total de la estancia":
                costoTotal();
                break;
            case "información detallada de cada reserva":
                infoDetallada();
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public static void infoDetallada(){
        
        StringBuilder infoCompleta = new StringBuilder();
        
        for (int i = 0; i < reservas.length; i++) {
          infoCompleta.append("=========== INFO RESERVA ").append(i+1).append(" ===========");
          infoCompleta.append("NOMBRE: ").append(reservas[i][0].nombre).append("\n");
          infoCompleta.append("APELLIDO: ").append(reservas[i][0].apellido).append("\n");
          infoCompleta.append("CEDULA: ").append(reservas[i][0].cedula).append("\n");
          infoCompleta.append("HABITACION: ").append(reservas[i][0].numeroHabitacion).append("\n");
          infoCompleta.append("ENTRADA: ").append(reservas[i][0].fechaEntrada).append("\n");
          infoCompleta.append("SALIDA: ").append(reservas[i][0].fechaSalida).append("\n");
          infoCompleta.append("COSTO TOTAL: ").append(costoEstancia[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null,infoCompleta.toString());
        
        servicios();
    }
    
    public static void costoTotal(){
        int posicion = posicionReserva();
        
        int costoNoche = 150000;
        for (int i = 0; i < reservas.length; i++) {
            
           infoReserva reserva = reservas[i][0];
            
            LocalDate fechaEntrada = DateUtils.convertirADate(reserva.fechaEntrada);
            LocalDate fechaSalida = DateUtils.convertirADate(reserva.fechaSalida);
            
            long dias = ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);
            costoEstancia[i] = (int) dias * costoNoche; 
        }
        JOptionPane.showMessageDialog(null,"El costo total de su reserva es de $"+ costoEstancia[posicion]);
        
        servicios();
    }
    
    
    public static void registrarNuevasReservas(){
        
        int cantidadReservasNuevas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de reservas a ingresar"));
        infoReserva [][] info = new infoReserva[cantidadInicialHuespedes + cantidadReservasNuevas][1];
        int [] costoEstanciaN = new int [info.length]; 
        
        for (int i = 0; i < reservas.length; i++) {
          
           info [i][0] = reservas[i][0] ;
           costoEstanciaN [i] = costoEstancia[i];
        }
        if (cantidadReservasNuevas >0) {
          
            for (int i = 0; i < cantidadReservasNuevas; i++) {

             String nombreHuesped = (String) JOptionPane.showInputDialog("Digite el nombre del huesped");
             String apellidoHuesped = (String) JOptionPane.showInputDialog("Digite el apellido del huesped"); 
             String cedulaHuesped = (String) JOptionPane.showInputDialog("Digite el cedula del huesped"); 
             String habitacionHuesped = (String) JOptionPane.showInputDialog("Digite el Habitacion del huesped"); 
             String entradaHuesped = (String) JOptionPane.showInputDialog("Digite el fecha de ENTRADA del huesped en formato dd/MM/yyyy"); 
             String salidaHuesped = (String) JOptionPane.showInputDialog("Digite el fecha de SALIDA del huesped en formato dd/MM/yyyy"); 

                infoReserva infor = new infoReserva(

                    nombreHuesped,
                    apellidoHuesped,
                    cedulaHuesped,
                    habitacionHuesped,
                    entradaHuesped,
                    salidaHuesped    
                );
           
                info[cantidadReservas][0] = infor ;
                
                cantidadReservas ++;
            }
            
            reservas = info;
            costoEstancia = costoEstanciaN;
            JOptionPane.showMessageDialog(null, "Informacion Agregada con exito");
        }else{
            JOptionPane.showMessageDialog(null, "Debe ser mayor a 0");
        }
     
       servicios();
    }
    
    public static int posicionReserva(){
        
        String [] cedula = new String [reservas.length];
        for (int i = 0; i < reservas.length; i++) {
            cedula[i]= reservas[i][0].cedula;
        }
       String seleccionS =(String)JOptionPane.showInputDialog(null,"Seleccione la cedula con la que esta hecha la reserva","RESERVAS",JOptionPane.QUESTION_MESSAGE,null,cedula,cedula[0]);
        int posicion = -1;
        for (int i = 0; i < reservas.length; i++) {
            
            if (reservas[i][0].cedula.equals(seleccionS)) {
                posicion = i;
                break;
            }
        } 
        
        return posicion;
    }
    
    public static void cancelaReservas(int posicion){
        
       infoReserva ultimasReservas [][] = new  infoReserva [reservas.length-1][1];
       int j = 0;
        for (int i = 0; i < reservas.length; i++) {
            if (i != posicion ) {
               ultimasReservas[j] = reservas[i];
               j++;
            }
        }
        reservas = ultimasReservas;
        cantidadReservas --;
        JOptionPane.showMessageDialog(null, "CANCELADA CON EXITO");
        servicios();
    }
    
}
    

