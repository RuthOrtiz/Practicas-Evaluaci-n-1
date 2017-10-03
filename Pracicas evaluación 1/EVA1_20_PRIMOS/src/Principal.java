
import java.util.Scanner;

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
        Scanner sCaptu = new  Scanner (System.in);
        System.out.println("Introduce el número a analizar");
        int iSeraPrimo = sCaptu.nextInt();
        
        int iResi;
        for (int i = 2; i < iSeraPrimo; i++) { // en cuanto los números dividan entre el numero a buscarno hara nada
            iResi = iSeraPrimo % i;
            
            if (iResi == 0) {
                System.out.println("El número no es primo");
                break; // para detener el for
            }
        }
        
         int iRaiz = (int)Math.sqrt(iSeraPrimo);
        for (int i = 2; i < iSeraPrimo; i++) { // en cuanto los números dividan entre el numero a buscarno hara nada
            iResi = iSeraPrimo % i;
            
            if (iRaiz == 0) {
                System.out.println("El número no es primo");
                break; // para detener el for
            }
        }
    }
    
}
// no es eficiente ésta manera 

// si el numero no es primo no dara

//BIG OH ---> O(N)