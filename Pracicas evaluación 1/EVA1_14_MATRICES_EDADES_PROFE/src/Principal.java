
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
        int aiArray2D [][]; //AL DECLARARLO SE HACE NULO
        //DEFINIMOS PRIMERO LAS FIILAS(GRUPOS)
        //PREGUNTAR EL NUMERO DE GRUPOS
        Scanner sCaptu = new Scanner (System.in);
        System.out.println("Número de grupos: ");
        int iNoGpo = sCaptu.nextInt();
        //Cantidad de grupos
        aiArray2D = new int [iNoGpo][];//n grupos
        //PARA CADA GRUPO PREGUNTAR EL NÚMERO DE ALUMNOS
        int iNoAlu;
        for (int i = 0; i < iNoGpo; i++) {
            //PREGUNTAR EL NÚMERO DE ALUMNOS
            System.out.println("Número de alumnos para el grupo " + i + ":" );
            iNoAlu =sCaptu.nextInt();
            aiArray2D[i] = new int [iNoAlu]; //PARA GUARDAR LAS EDADES
        }
        //PEDIR LOS DATOS
        for (int i = 0; i < iNoGpo; i++) { //FILAS----> GRUPOS
            for (int j = 0; j < aiArray2D[i].length; j++) {
                System.out.println("Edad Grupo" + i + ":");
                aiArray2D[i][j] =sCaptu.nextInt();
                
            }
            
        }
        
        //CALCULAR LOS PROMEDIOS
        int iAcum;
        double dProm;
        for (int i = 0; i < aiArray2D.length; i++) { //FILAS----> GRUPOS
            iAcum = 0;
            dProm = 0;
            for (int j = 0; j < aiArray2D[i].length; j++) {
                iAcum += aiArray2D[i][j];//sumatoria de todas las edades
                
            }
            dProm =iAcum / aiArray2D[i].length;
            System.out.println("Para el grupo" + i + ", el promedio de " + "edad es: " + dProm);
            
        }
       // aiArray2D = new int [4][]; // las columnas representan las columnas se creo un nuevo arreglo con 4 posicioones se definio las materias falta los alumnos
        //aiArray2D[0] = new int [10]; // //1ER GRUPO 10 ALUMNOS     cada posicion en este arreglo es otro arreglo
        //aiArray2D[1] = new int [28];
    }
    
}
//para rrecorrer un arreglo es un for por cada dirección
//aiArray2D- vale 4 y aiArray2D[0] vale 10 en este ejmplo

//BIG OH --> O(N2)