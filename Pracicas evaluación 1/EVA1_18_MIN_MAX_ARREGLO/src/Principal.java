
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
//Hayar el valor máximo y mínimo
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingresa el tamaño del arreglo"); // se solicita el tamaño del arreglo
        Scanner sCap = new Scanner (System.in);
        int tArre = sCap.nextInt();
        
        int aiArreM [] = new int [tArre];
        for (int i = 0; i < aiArreM.length; i++) { // for para llenar arreglo
            System.out.println("Ingresa los datos que formarán el arreglo");
            aiArreM [i] = sCap.nextInt(); // se guarda en la variable aiArreM
        }
    
        
        int valMax = aiArreM [0]; 
        int valMin = aiArreM [0];
        for (int i = 0; i < aiArreM.length; i++) {
        if ( aiArreM [i] >= valMax) {
            valMax = aiArreM [i];
               
        }
        if(aiArreM [i] <= valMin){
            valMin = aiArreM [i];
            
        }
        }
        System.out.println("El valor maximo es: " + valMax ); // fuera del for para que no me imprima número de veces del tamaño del arreglo
        System.out.println("El valor minimo es: " + valMin);
        
    }
    }
// BIG OH --> O(N)