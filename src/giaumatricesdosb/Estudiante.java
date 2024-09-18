package giaumatricesdosb;

//class EstudianteZ{

import javax.swing.*;

//    String nombre;
//    String apellido;
//    String identificación;
//    String curso;
//    double notasAsignatura;
//    public EstudianteZ(String nombre,String apellido,String identificación,String curso,double notasAsignatura){
//        
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.identificación = identificación;
//        this.curso = curso;
//        this.notasAsignatura = notasAsignatura;
//    }
//}
public class Estudiante {
    public static void main(String[] args) {
        
        /*36. Desarrolla un programa en Java que permita gestionar el registro de notas 
        de estudiantes. El programa debe: 
        1. Solicitar la información básica de cada estudiante (nombre, apellido, número 
        de identificación, curso). 
        2. Permitir ingresar las notas de diferentes asignaturas para cada estudiante. 
        3. Calcular el promedio de notas de cada estudiante. 
        4. Mostrar la información detallada de cada estudiante, incluyendo las notas de 
        cada asignatura y el promedio general. */
        
        int cantidadEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de alumnos"));
        String [][] informacionE = new String [cantidadEstudiantes][4];
        Double [][] notasEstudiantes = new Double [cantidadEstudiantes][5];
        
        StringBuilder infoCompleta = new StringBuilder();
        
        
        for (int i = 0; i < cantidadEstudiantes; i++) {
            
          infoCompleta.append("========== Informacion Completa Alumno ").append(i+1).append("============\n");
            
          informacionE [i][0] = (String)JOptionPane.showInputDialog("Digite el nombre del alumno "+ (i+1));  
          informacionE [i][1]= (String)JOptionPane.showInputDialog("Digite el apellido del alumno "+ (i+1));
          informacionE [i][2]= (String)JOptionPane.showInputDialog("Digite el numero de identificacion");
          informacionE [i][3]= (String)JOptionPane.showInputDialog("Digite el curso del alumno "+ (i+1));
          
          infoCompleta.append("NOMBRE :").append(informacionE [i][0]).append("============ ");
          infoCompleta.append("APELLIDO :").append(informacionE [i][1]).append("============ ");
          infoCompleta.append("IDENTIFICACION :").append(informacionE [i][2]).append("============ ");
          infoCompleta.append("CURSO :").append(informacionE [i][3]).append("============ ");
          
          notasEstudiantes [i][0] = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota para Matematicas del estudiante "+ (i+1)));
          notasEstudiantes [i][1] = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota para Naturales del estudiante "+ (i+1)));
          notasEstudiantes [i][2] = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota para Sociales del estudiante "+ (i+1)));
          notasEstudiantes [i][3] = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota para Ingles del estudiante "+ (i+1)));
          
          notasEstudiantes [i][4] = (notasEstudiantes [i][0]+notasEstudiantes [i][1]+notasEstudiantes [i][2]+notasEstudiantes [i][3])/4;
          
          infoCompleta.append("PROMEDIO :").append(notasEstudiantes[i][4]).append("============\n");
          
         
        }
         JOptionPane.showMessageDialog(null, infoCompleta.toString());
        
        
        
    }
}
