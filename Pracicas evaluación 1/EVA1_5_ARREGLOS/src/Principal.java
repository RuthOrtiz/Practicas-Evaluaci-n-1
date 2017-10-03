/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
//ARREGLOS
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiNume [] = new int [10];
        for (int i = 0; i < 10; i++) {
            aiNume [i] = (int) ( Math.random() * 10) + 1 ;
                
            }
        // FOR EACH, se pone for mas control mas for mas object: elemen
        
        for(int x: aiNume){// int x; for (int i = 0; i<10; i++)
            System.out.println("El valor es: " + x);
        }
        //MULTIPLES ARREGLOS
        int [] aiArre1, aiArre2, aiArre3; //TODOS SON ARREGLOS
        aiArre1 = new int [10];
        aiArre2 = new int [54];
        aiArre3 = new int [88];
        
        //ARREGLOS Y VARABLES
        int aiArre[], iVar, iVar2; // aiArre es una referencia de memoria aiArre es el arreglo
        aiArre = new int [10];
        iVar = 88;
        iVar = 18;
        
    }
    
}
//BIG OH ---> O(N)