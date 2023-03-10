/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author Bryan Carcamo
 */
public class Duplicados {
    private int[] matriz ;
    
     public void llenarArreglo(int [] matriz){
    
     
     if(matriz.length>=5 && matriz.length <=10){
     for(int i=0; i<matriz.length;i++){    
      matriz[i]=(int)Math.floor((Math.random()*(10-1 +1))+1);
     
         System.out.print("["+matriz[i]+"]");
     }
         System.out.println("");    
    }else{
         System.out.println("Error en el ingreso de datos");    
             }
    }
     
     public void SDuplicados(int[]matriz){
    if(matriz.length>=5 && matriz.length <=10){     
     for(int i=0; i<matriz.length;i++){     
      for(int x=0; x<matriz.length;x++){  
           if(i != x){
           if(matriz[i]==matriz[x]){
           matriz[x]=0;
           }
           }
      }
         System.out.print("["+matriz[i]+"]");
     }
    }
         System.out.println("");    
     }

    public int[] getMatriz() {
        return matriz;
    }
}
