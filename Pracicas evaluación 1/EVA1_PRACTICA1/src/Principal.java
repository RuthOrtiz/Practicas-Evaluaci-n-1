
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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Se pide el número de edades que se desean calcular
        System.out.println("¿Cuántas edades deseas capturar?");
        Scanner sCaptu = new Scanner(System.in);
        int vCap = sCaptu.nextInt();
        int aiArre[];
        aiArre = new int[vCap]; // arreglo para capturar el número de datos que el usuario ingresó

        // For para pedir y capturar las edades
        for (int i = 0; i < aiArre.length; i++) {
            System.out.println("Introduce las edades");
            aiArre[i] = sCaptu.nextInt();

        }
        // Promedio de las edades dadas
        double iAcum = 0; // double para que muestre los decimales
        for (double iV : aiArre) {
            iAcum = iAcum + iV;

        }
        double r;
        r = iAcum / vCap;
        System.out.println("El promedio de las edades capturadas es:" + r);

        //Moda
        int iCon = 0, iModa = 0;

        for (int i = 0; i < aiArre.length; i++) {
            int nRep = 0;
            for (int j = 0; j < aiArre.length; j++) {
                if (aiArre[i] == aiArre[j]) { // sw comparan los valores en la posicion i y j
                    nRep++;
                }
                if (iCon < nRep) {
                    iModa = aiArre[i]; // se iguala  la posicion en i, entrara una vez que las repeticiones se cuenten
                    iCon++;
                }
            }
        }
        if (iCon > 1) { // tiene que ser mayor a 1 pues las edades se repetiran todas 1 vez y después no se mostrara la moda
            System.out.println("La moda es: " + iModa + ", se repite : " + iCon + " veces");

        } else {
            System.out.println("Las edades no tienen moda");
        }
       // Desviación estándar
        
        double iSuma = 0;
        double n;
        double pot;
        for (int i = 0; i < aiArre.length; i++) {

            n = aiArre[i] - r;
            pot = Math.pow(n, 2);
            iSuma = iSuma + pot;

        }
        double fin;
        fin = Math.sqrt(iSuma / (vCap - 1));

        System.out.println("La desviación estandar es : " + fin);

    }

}
