
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
    public static final int TAMA_ARRE=5;
    public static void main(String[] args) {
        // TODO code application logic here
        // ARREGLO EDADES
        int aiEdad[];
        aiEdad=new int[TAMA_ARRE];
        Scanner sCaptu=new Scanner(System.in);
        for(int i=0; i< aiEdad.length; i++){
            System.out.println("Introduce la edad ");
            aiEdad[i]=sCaptu.nextInt();
        }
        //imprimir
        for(int x: aiEdad){
            System.out.println("Edades : "+x);
        }
        //CREAR DUPLICADO
        int aiCopiaEdad[];
         
        aiCopiaEdad=new int[TAMA_ARRE];
        for (int i = 0; i < TAMA_ARRE; i++) {
            aiCopiaEdad[i]=aiEdad[i];
            
        }
        for(int x: aiCopiaEdad){
            System.out.println("Copia de la edad = " + x);
        }
        System.out.println(aiCopiaEdad);
        System.out.println(aiEdad);
            
    }
    
}
// BIG OH O(N)