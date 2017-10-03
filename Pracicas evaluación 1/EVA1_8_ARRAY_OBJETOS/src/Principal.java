//SE CREO UN ARREGLO Y LUEGO UNA COPIA DEL MISMO
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
        Alumno aaDatosAlumno[]; //El arreglo se inicializa en nulo
        aaDatosAlumno = new Alumno[10]; // habra espacio para 10 alumnos, aun no existen los alumnos olo se esta creando el espacio para los alumnos

        for (int i = 0; i < aaDatosAlumno.length; i++) {
            aaDatosAlumno[i] = new Alumno("Ruth", "16550520", 0);//0 para isc
        }

        for (Alumno aaDatosAlumno1 : aaDatosAlumno) {
            System.out.println("Nombre:" + aaDatosAlumno1.getsNom());
            System.out.println("Matrícula:" + aaDatosAlumno1.getsMatri());
            System.out.println("Carrera:" + aaDatosAlumno1.getiCar());
        }
        //COPIA DEL ARREGLO
        Alumno aaDatosAlumnoArregloCopiado[]; // se declara la copia del arreglo
        aaDatosAlumnoArregloCopiado = new Alumno[10]; // copia del arreglo con el mismo tampaño

        for (int i = 0; i < aaDatosAlumnoArregloCopiado.length; i++) {
            aaDatosAlumnoArregloCopiado[i] = new Alumno("Alejandra", "123213423", 0); // Datos diferentes para ver la diferencia
            //aaDatosAlumnoArregloCopiado [i] = aaDatosAlumno [i];  se iguala al original, otra manera de ponerlo    
        }

        for (Alumno aaDatosAlumno2 : aaDatosAlumnoArregloCopiado) {
            System.out.println("Nombre:" + aaDatosAlumno2.getsNom());
            System.out.println("Matrícula:" + aaDatosAlumno2.getsMatri());
            System.out.println("Carrera:" + aaDatosAlumno2.getiCar());
        }

    }
}

class Alumno {

    private String sNom;
    private String sMatri;
    private int iCar;

    public Alumno(String sNombre, String sMatricula, int iCarrera) {
        sNom = sNombre;
        sMatri = sMatricula;
        iCar = iCarrera;
    }

    public String getsNom() {
        return sNom;
    }

    public void setsNom(String sNom) {
        this.sNom = sNom;
    }

    public String getsMatri() {
        return sMatri;
    }

    public void setsMatri(String sMatri) {
        this.sMatri = sMatri;
    }

    public int getiCar() {
        return iCar;
    }

    public void setiCar(int iCar) {
        this.iCar = iCar;
    }

}

// BIG OH ---> O(N)