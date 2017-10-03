/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
//COMPORTAMIENTO DE STACK
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Llamando a A");
        A();
        System.out.println("Termino llamada a A");
    }
    public static void A (){
        System.out.println("Llamando a B");
        B();
        System.out.println("Termino llamada a B");
    }
    public static void B(){
        System.out.println("Llamando a C");
        C();
        System.out.println("Termino llamada a C");
    }
    public static void C(){
        System.out.println("FIN DEL CAMINO");
    }
    
}
// se retira primero el main y se empieza a ejecutar con el main es el Stack se pone ne pila y s eva retirando hatsa que quede solo el main

// BIGH OH ----> O(1)