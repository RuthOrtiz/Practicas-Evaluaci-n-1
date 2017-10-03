
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//
/**
 *
 * @author temporal2
 */
public class Principal {
// ingresar numeros y que regrese 54321
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //ARREGLO NUMEROS
      
      Scanner sCaptu = new Scanner (System.in);
      System.out.println("Introduce la cantidad de números que desea ingresar: ");
      int cNum = sCaptu.nextInt();
      int aiArre[];
      aiArre = new int [cNum];
        for (int i = 0; i < aiArre.length; i++) {
            System.out.println("Introduce los números");
            aiArre[i] = sCaptu.nextInt();
            
        }
        //IMPRIMIMOS LAS EDADES
        for (int y : aiArre) {
         System.out.println("Los números son: " + y);
        }
        
        //DUPLICADO
        int aiCopiaArre[] = new int [cNum];
        int cont = 0;
        for (int i = aiArre.length -1 ; i >= 0; i--) { // menos uno para que muestre 321
         aiCopiaArre [cont] = aiArre [i];
           cont ++;
            
        }
        for (int i = 0; i < aiCopiaArre.length; i++) {
            System.out.println("Los valores invertidos son:" + aiCopiaArre[i]);
        }
        
    }
    
}

//BIG OH --> O(N)