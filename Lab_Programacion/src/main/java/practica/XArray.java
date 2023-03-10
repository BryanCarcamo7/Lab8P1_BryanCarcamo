/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author Bryan Carcamo
 */
public class XArray {
    private int [][] arreglo;
    private int[] diagonales;
    
    public void llenarArreglo(int [][] arreglo){
    for(int i=0; i<arreglo.length;i++){
    for(int x=0; x<arreglo.length;x++){
    arreglo[i][x]=(int)Math.floor((Math.random()*(4100-1100 +1))+1100);
    
    System.out.print("["+arreglo[i][x]+"]");
    }
        System.out.println("");
    }
        
    }
    
    public void Diagonales1(int[][] arreglo){
    for(int i=0; i<arreglo.length;i++){
    for(int x=0; x<arreglo.length;x++){
        if(i==x){
            System.out.print("["+arreglo[i][x]+"]");        
        }
    }
    
    }
      
    }
    
    public void Diagonales2(int[][] arreglo){
        int x=(arreglo.length)-1;
        for(int i=0; i<arreglo.length;i++){
            System.out.print("["+arreglo[i][x--]+"]");
    }
        System.out.println("");
    }
}
