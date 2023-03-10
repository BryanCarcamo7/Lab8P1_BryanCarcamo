/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author Bryan Carcamo
 */
public class Lab8P1_BryanCarcamo {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in).useDelimiter("\n");
        XArray x=new XArray();
        Duplicados dup=new Duplicados();
         int opcion=0;
        while(opcion!=4){
        System.out.println("---------MENU--------");
        System.out.println("1.X-Array ");
        System.out.println("2.Sin duplicados");
        System.out.println("3.Oracion a Matriz ");
        System.out.println("4.Salir ");
        System.out.println("Opcion: ");
       opcion=lea.nextInt();
       
       switch(opcion){
       case 1:
           System.out.println("Ingrese un tamaño:");
           int tamaño=lea.nextInt();
           int[][] ar=new int [tamaño][tamaño];
           
           System.out.println("Matriz Generada: ");
           
           x.llenarArreglo(ar);
           
           System.out.println("\nArreglo de diagonales: ");
           x.Diagonales1(ar);
           x.Diagonales2(ar);
           
       break;
       
       case 2:
           System.out.println("Ingrese un tamaño: ");
           tamaño=lea.nextInt();
 
           int [] arr=new int[tamaño];
           
           System.out.println("Arreglo generado: ");
           dup.llenarArreglo(arr);
           
           System.out.println("Arreglo sin duplicados: ");
           dup.SDuplicados(arr);
           
       break;
       
       case 3:
           System.out.println("Escriba una oracion: ");
           String oracion=lea.next();
           
           
           break;
           
       case 4:
           System.out.println("Feliz dia");
           break;
       }
        }
    }
}
