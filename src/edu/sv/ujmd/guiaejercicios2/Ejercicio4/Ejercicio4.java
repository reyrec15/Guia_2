/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sv.ujmd.guiaejercicios2.Ejercicio4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Brian Reyes
 */
public class Ejercicio4 {
     public static void main(String[] args) {
        // TODO code application logic here
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (isr);
        Scanner teclado=new Scanner(System.in);
        int numero,val,mayor,menor;
       

        System.out.println("Ingrese la cantidad de numeros a evaluar: ");
        numero=teclado.nextInt();
        mayor=0;
        menor=1000000000;

        for (int i=1;i<=numero;i++)
        {
            //peticion de consola a usuario
            System.out.println("Ingrese cantidad" + i+": ");
            val=teclado.nextInt();

            if (val>mayor){
                mayor=val;
            }
            if (val<menor){
                menor=val;
            }
            
        }
        System.out.println("El numero mayor es: "+mayor+"\n");
        System.out.println("El numero menor es: "+menor+"\n");
        System.out.println("Los numeros pares son: "+numero/2);

    }
}
