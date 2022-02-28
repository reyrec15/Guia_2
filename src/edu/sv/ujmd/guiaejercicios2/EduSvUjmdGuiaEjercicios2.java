/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.sv.ujmd.guiaejercicios2;

import javax.swing.JOptionPane;

/**
 *
 * @author Brian Reyes
 */
public class EduSvUjmdGuiaEjercicios2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String lectura;
        double calificacion;
        //cuadro de dialogo para poder ingresar los datos requeridos por el usuario
        lectura= JOptionPane.showInputDialog("Por favor ingresar la calificacion del alumno");
            calificacion=Double.parseDouble(lectura);
            if(calificacion>=7)
                //mensajes al usuario con el resultado de su nota de acuerdo a rangos establecidos
                JOptionPane.showMessageDialog(null,"El alumno paso la materia");
            else
            {
                //mensajes al usuario con el resultado de su nota de acuerdo a rangos establecidos
                JOptionPane.showInputDialog(null,"El alumno reprobo la materia");
                //mensajes al usuario con el resultado de su nota de acuerdo a rangos establecidos
                if(calificacion>=6.5 && calificacion<=6.99)
                   JOptionPane.showMessageDialog(null,"puede aplicar a una recuperacion");
            }
    
    }
    
}
