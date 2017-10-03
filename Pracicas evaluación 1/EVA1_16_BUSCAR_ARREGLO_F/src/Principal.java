
import java.util.Scanner;

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
        System.out.println("Define el tamaño del arreglo:");
        Scanner sCptu = new Scanner ( System.in);
        int taArre = sCptu.nextInt();
        
        int aiArreglo [] = new int [taArre] ;
        for (int i = 0; i < aiArreglo.length; i++) {
            System.out.println("Introduce los valores que estarán en el arreglo");
            aiArreglo [i] =sCptu.nextInt();
        }
        int posA =0;
        System.out.println("¿Que valor desea buscar?");
        int  iVal = sCptu.nextInt();
        int iCond=0;
        
        for (int i = 0; i < aiArreglo.length; i++) {
            if (iVal == aiArreglo[i] ) {
                posA =i;
                iCond=1;
            }
        }
        if(iCond==1){
        System.out.println("El valor " + iVal + "se encuentra en la posisción: " + (posA+1));
        }
        else{
            System.out.println("El número no existe");
        }
    }
    
}
//BIG OH --> O(N)