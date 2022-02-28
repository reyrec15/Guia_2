/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sv.ujmd.guiaejercicios2.Ejercicio2;


import javax.swing.*;

/**
 *
 * @author Brian Reyes
 */
public class Ejercicio2 {
  public static void main(String[] args) {
        // TODO code application logic here
        String aux;
        int pelota;
        double transaccion;
        double descuento=0;
        double monto;
        //cuadro de dialogo para poder ingresar los datos requeridos por el usuario
        aux=JOptionPane.showInputDialog("Ingrese el valor de la compra");
        transaccion=Double.parseDouble(aux);
        
        aux=JOptionPane.showInputDialog("Por favor ingresar el color de la bola. Si es Roja (1) Si es verde (2) Si es Blanca (3)");
        pelota=Integer.parseInt(aux);
        switch(pelota)
        {
            case 1:
            
                descuento=transaccion*.10;
                monto=transaccion-descuento;
            break;
            
            
            case 2:
            
                descuento=transaccion*0.05;
                monto=transaccion-descuento;
            break;
            
            case 3:
            
                monto=transaccion;
            break;
                
            default:
                
                monto=transaccion;
                
            break;
        }
        JOptionPane.showMessageDialog(null,"El valor de la transaccion es $: "+ transaccion+ " Con un descuento de $ " + descuento+ "Total a cancelar: " + monto);
        
        }
  }
        
        
     
    
    

