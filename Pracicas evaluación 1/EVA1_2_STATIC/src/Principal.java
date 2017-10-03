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
        MiClasePrueba mcpObjeto = new MiClasePrueba();
        mcpObjeto.imprimirMensaje();
        System.out.println(mcpObjeto.sNom);
        
        MiClasePrueba2.imprimirMensaje();
        System.out.println(MiClasePrueba2.sNom);
    }
    
}

class MiClasePrueba {       //duplicar codigo alt shift flecha abajo
    public String sNom = "Ruben";
    public void imprimirMensaje(){  //metodo
        System.out.println("Hola mundo!!");
    }
}
class MiClasePrueba2 {     
    public static String sNom = "Ruben";
    public static void imprimirMensaje(){  //metodo
        System.out.println("Hola mundo!!");
    }
}
// static metodos o atributos sin instancia una instancia crear un objeto
//sNom y imprimirMensaje no existen por lo que hay que instanciar la clase para poder usarlos

//BIGH OH ------> O(1)