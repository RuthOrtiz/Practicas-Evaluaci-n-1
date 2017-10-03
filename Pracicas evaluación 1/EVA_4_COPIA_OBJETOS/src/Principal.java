/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//COPIA DE VARIABLES
/**
 *
 * @author administrador
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 5;
        System.out.println("i = " + i);
        // CREAR UBA COPIA DE I
        int iCopia = i; // ASIGNAMOS EL VALOR DE i A LA VARIABLE iCopia
        System.out.println("Copia de i = " + iCopia);
        i++;
        System.out.println("i++ = " + i);
        System.out.println("iCopia =" + iCopia);
        // DECLARAR UN OBJETO DE TIPO NUMERO
        Numero nVal = new Numero(); // CREAMOS EL OBJETO
        System.out.println("Valor de nVal.i= " + nVal.i);

        Numero nCopiaVal = nVal;//CRAMOS UNA "COPIA" <--- NO ES UNA COPIA   se esta duplicando la direccion de memoria no creando una copia
        System.out.println("Valor de nCopiaVal.i = " + nCopiaVal.i);
        nVal.i++;
        //IMPRIMIMOS nVal y nCopiaVal
        System.out.println("Valor de nVal.i = " + nVal.i);
        System.out.println("Valor de nCopiaVal.i = " + nCopiaVal.i);
        //IMPRIMIR LOS OBJETOS
        System.out.println(nVal);
        System.out.println(nCopiaVal);

        //COPIA REAL DE UN OBJETO
        Numero nCopiaReal = new Numero();
        nCopiaReal.i = nVal.i;
        System.out.println("Valor de nVal.i = " + nVal.i);
        System.out.println("Valor de nCopiaReal.i = " + nCopiaReal.i);
        nVal.i++;
        System.out.println("Valor de nVal.i = " + nVal.i);
        System.out.println("Valor de nCopiaRea.i = " + nCopiaReal.i);
        //IMPRIMIR LOS OBJETOS
        System.out.println(nVal);
        System.out.println(nCopiaReal);
    }

}

class Numero {

    public int i = 18;

}


//BIGH OH ----> O(1)