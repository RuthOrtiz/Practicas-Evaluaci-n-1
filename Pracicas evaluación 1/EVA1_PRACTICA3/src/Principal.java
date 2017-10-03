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
        int aiArre2D[][] = new int[5][5];
        int aiArreglo2 [][] = new int[5][5];
        // llenar de valores aleatorios
        for (int i = 0; i < aiArre2D.length; i++) {
            for (int j = 0; j < aiArre2D[i].length; j++) {
                aiArre2D[i][j] = (int) (Math.random() * 100) + 1;

            }
        }
        for (int i = 0; i < aiArre2D.length ; i++) {
            for (int j = 0; j < aiArre2D.length; j++) {
                System.out.print("[" + aiArre2D[i][j] + "]");
            }
            System.out.println("");
                       
        }
        
        //IMPRIMIR DE MANERA INVERSA
        int iCon=0;
        for (int i = aiArre2D.length-1; i >=0 ; i--) {
            int iCon2=0;
            
            for (int j = aiArre2D.length-1; j >=0; j--) {
                aiArreglo2[iCon][iCon2] = aiArre2D [i][j];
                iCon2++;
            }
            iCon++;
                       
        }
        System.out.println("");
        for (int i = 0; i < aiArre2D.length ; i++) {
            for (int j = 0; j < aiArre2D.length; j++) {
                System.out.print("[" + aiArreglo2[i][j] + "]");
            }
            System.out.println("");
                       
        }
    }

}
