
import java.util.Scanner;

//PROYECTO INICIAL PARA CONOCER DE IDENTIFICAR LOS TIPOS PRIMITIVOS EN JAVA

/**
 *
 * @author administrador
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String sNom;
       int iEdad;
       double dSal;
       Scanner sScanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        sNom= sScanner.nextLine();
        System.out.println("Introduce tu edad");
        iEdad = sScanner.nextInt();
        System.out.println("Introduce tu salario");
        dSal = sScanner.nextDouble();
        
        hacerAlgo(sNom, iEdad, dSal);
       
       // no se puede usar metodos que no son estaticos dentro de una clase estatica
        //metodods o atributos estaticos son aquellos que no necesitan crear objetos de su clase p poder usar los metodos o atributos
        
        
    }
    /**
     * 
     * @param sNombre ejemoplo usando string
     * @param iEdad ejemplo usando entero
     * @param dSal ejemplo usando double
     */
    public static void hacerAlgo (String sNombre, int iEdad, double dSal) {
        System.out.println(sNombre + " " + iEdad + " " + dSal);
        
    }
}

// BIG OH ----> O(1)
