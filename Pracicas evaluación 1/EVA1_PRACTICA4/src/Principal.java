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
        double mat1 [][] = new double [5][5];
        double mat2 [][] = new double [5][5];
        double matres [][] = new double [5][5];
        
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mat1[i][j]  = (int) (Math.random()*100) + 1 ;
                mat2[i][j] = (int) (Math.random()*100) + 1 ;
                               
                 matres [i][j] = mat1[i][j] * mat2[i][j];
                
              }
        }
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print("[" + mat1[i][j] + " ] "  );
                
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                System.out.print("[" + mat2[i][j] + " ] "  );
                
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("El resultado de la multiplicación es: ");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                matres [i][j] = mat1[i][j] * mat2[i][j];
                
                System.out.print("[" + matres[i][j] + " ] "  );
                
            }
            System.out.println("");
        }
        
                
    }
    
}
