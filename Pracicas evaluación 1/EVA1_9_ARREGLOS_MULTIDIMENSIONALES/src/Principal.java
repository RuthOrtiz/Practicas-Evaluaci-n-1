/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int aiMatriz[][]= new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                aiMatriz[i][j]=(int)(Math.random()*10)+1;
                
            }
            
        }
         for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("["+aiMatriz[i][j]+"]"); // print para que se imprima [] []
                                                                                     
                
            }
           System.out.println(""); // se puso para que se imprima en la siguiente linea asi: [] []
                                                                                           //[] [] de lo contrario se imprimen juntos
        }
         for(int[]aiMatriz1:aiMatriz){
             for (int b: aiMatriz1);
             
         }
          System.out.println("");
    }
    
}
// BIG OH ----> O(N2)