/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sv.ujmd.guiaejercicios2.Ejercicio3;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Brian Reyes
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner reader = new Scanner(System.in);
        double sueldo, mayor = 0, menor = 1000;
        int i = 1, contador = 0;

        while (i <= 5) {
             System.out.print("Ingrese primer numero: ");
             sueldo = reader.nextInt();
            if (sueldo > 300 ) {
                contador = contador + 1;
            }
            else if (sueldo < 0)//Esta condición se ejecuta cuando ninguna condición fue válida
            {
                System.err.println("ERROR, el dato introducido es inválido");
                System.exit(0);
                
//Mensaje de error que se manda cuando no se tecleó datos válidos
            }
            if (sueldo > mayor) {
                mayor = sueldo;
            }
            if (sueldo < menor) {
                menor = sueldo;
            }
           
            i = i + 1;
        }
        JOptionPane.showMessageDialog(null, " El sueldo Mayor es de $: " + mayor
                + "\nEl sueldo Menor es de $: " + menor
                + "\n" + contador + " Empleados tienen un sueldo mayor de $300");
    }

}
    


