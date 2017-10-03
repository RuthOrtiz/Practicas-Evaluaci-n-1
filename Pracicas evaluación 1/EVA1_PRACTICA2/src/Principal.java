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
        int aiArray [][] = new int [10][10]; // la dimensión se pone al último
        
        for (int i = 0; i < aiArray.length; i++) {
            for (int j = 0; j < aiArray[i].length; j++) {
                aiArray[i][j]=0;
                if(i==j){
                    aiArray[i][j]=1;
                }
            }
            
        }
        
        for (int i = 0; i < aiArray.length; i++) {
            for (int j = 0; j < aiArray[i].length; j++) {
                System.out.print(aiArray[i][j]+" "); // print no salear renglón
            }
            System.out.println(" "); // imprimira abajo
        }
    }
    
}
