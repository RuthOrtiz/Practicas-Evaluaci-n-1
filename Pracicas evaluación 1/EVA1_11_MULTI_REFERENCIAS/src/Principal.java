/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ale
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiArray3D[][][]=new int[10][2][7];
        
        for (int i = 0; i < aiArray3D.length; i++) {
            for (int j = 0; j < aiArray3D[i].length; j++) { // entra al segundo arreglo que es 2
                for (int k = 0; k < aiArray3D[i][j].length; k++) { // entra al 3 arreglo 37
                    aiArray3D[i][j][k]=(int)(Math.random()*100)+1;
                }
                
            }
        }
         for (int i = 0; i < aiArray3D.length; i++) {
            for (int j = 0; j < aiArray3D[i].length; j++) {
                for (int k = 0; k < aiArray3D[i][j].length; k++) {
                    System.out.println(aiArray3D[i][j][k]);
                }
                
            }
        }
    }
    
}
// BGI OH --> O(n3)