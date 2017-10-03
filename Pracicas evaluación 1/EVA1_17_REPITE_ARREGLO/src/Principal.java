/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ale
 */
import java.util.Scanner;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("¿ De qué tamaño desea el arreglo ? ");
        Scanner sCap = new Scanner(System.in);
        int tamArr = sCap.nextInt();

        int aiArre[] = new int[tamArr];
        for (int i = 0; i < aiArre.length; i++) {
            System.out.println("Ingresa los valores que formarán parte del arreglo: ");
            aiArre[i] = sCap.nextInt();
        }

        int nRep = 0;
        int vCont = 0;

        System.out.println("El numero a buscar es:");
        nRep = sCap.nextInt();
        for (int i = 0; i < aiArre.length; i++) { //for para buscar

            if (nRep == aiArre[i]) {
                vCont++;
            }
        }
        System.out.println("El numero de repeticiones es:" + vCont);
   
    }

}
// BIG OH --> O(N)