/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.dsantanal.a08;

/**
 *
 * @author cecigutierrez
 */
public class SPP2DSantanaLA08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int promedio, sumaPar=0, sumaNon=0;
        int contenido=0;
        int [][] matrix = {{10,30,89,48,56},
                          {32,23,84,20,10},
                          {72,108,71,402,8}};
       
       for (int i=0;i<matrix.length;i++){
           for (int j=0; j<matrix[i].length; j=j+2){
               sumaPar=sumaPar+matrix [i][j];
               contenido++;
           }
       }
       promedio=sumaPar/contenido;
        System.out.println("El promedio es "+promedio);
        
        for(int i=0;i<matrix.length;i++){
            for (int j=1; j<matrix[i].length; j=j+2){
                sumaNon=sumaNon+matrix [i][j];
            }
            
        }
    System.out.println("La suma de impares es "+sumaNon);
    }
    
}
    
