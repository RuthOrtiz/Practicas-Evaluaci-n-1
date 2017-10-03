
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
        System.out.println(" ¿Qué temperatura desea conocer?,  \n  Temperatura: 1 - max , 2 - max media, 3 - media, 4- min media, 5- min abs,  \n  6- Precipitacion total  \n  7- Días de lluvias \n  8 - Días de nevadas \n 9- Horas de sol \n  10- Humedad relativa  ");
        Scanner sCap = new Scanner(System.in);
        int vDat = sCap.nextInt();
        vDat= vDat-1;
        System.out.println("");
        System.out.println("¿ De qué mes desea conocer la temperatura?, los meses se escogen del 1-12 ");
        int vMes = sCap.nextInt();
        vMes=vMes-1;
        double vRes=0;
        String sMes="";
        String sDato="";
        
        // cada mes corresponde a {} y el ultimo{} son los datos anuales
        double aiArray[][] = {{28.2, 16.8, 9.3, 1.8, -5.0, 7.5, 2.0, 1.30, 173.7, 49}, {32.0, 19.8, 11.8, 3.8, -18.0, 5.7, 1.7, 0.18, 205.0, 44},
        {34.0, 24.5, 15.9, 7.3, -9.0, 5.0, 1.7, 0.09, 263.6, 36}, {39.0, 28.8, 20, 11.3, -3, 0, 5.5, 2.0, 0.09, 282.8, 31},
        {41.0, 32.8, 24.1, 15.5, 0.0, 15.3, 3.0, 0.0, 304.9, 31}, {41.2, 34.9, 27.6, 20.4, 9.4, 35.4, 5.6, 0.0, 299.5, 37},
        {40.0, 32.6, 26.4, 20.3, 11.0, 105.3, 11.3, 0.0, 272.4, 51}, {38.0, 31.3, 25.2, 19.1, 10.5, 103.8, 12.9, 0.0, 248.7, 56},
        {37.0, 28.7, 22.4, 16.1, 5.0, 101.6, 11.0, 0.0, 2018.4, 57}, {35.0, 26.5, 18.6, 10.8, -3.0, 20.0, 4.0, 0.0, 201.1, 51},
        {32.0, 21.0, 13, 5.0, -11.0, 10.5, 2.2, 0.50, 184.0, 49}, {28.0, 17.0, 9.4, 1.9, -12.0, 5.8, 1.5, 1.88, 166.8, 51},
        {41.2, 26.2, 18.6, 11.1, -18.0, 422.3, 58.9, 4.04, 2680.9, 45}};
         for (int i = 0; i < 13; i++) {
            if(i==vMes){
                for (int j = 0; j < 10; j++) {
                    if(j==vDat){
                        vRes=aiArray[i][j];
                    }
                }
            }
        }
         
        switch(vMes){
            case 0:
                sMes="enero";
                break;
            case 1:
                 sMes="Febrero";
                break; 
                
                case 2:
                 sMes="Marzo";
                break; 
                
                case 3:
                 sMes="Abril";
                break; 
                case 4:
                 sMes="Mayo";
                break; 
                
                case 5:
                 sMes="Junio";
                break; 
                
                case 6:
                 sMes="Julio";
                break; 
                
                case 7:
                 sMes="Agosto";
                break; 
                
                case 8:
                 sMes="Septiembre";
                break; 
                
                case 9:
                    sMes="Octubre";
                break; 
                
                case 10:
                 sMes="Noviembre";
                break; 
                
                case 11:
                 sMes="Diciembre";
                break; 
                
                case 12:
                 sMes="Anual 2010";
                break; 
        }  
        switch(vDat) {
            case 0:
              sDato = "temperatura máxima:";
              break;
              case 1:
                  sDato = "Temperatura máxima media:";
                  break;
                  
                  case 2:
                  sDato = "Temperatura media:";
                  break;
                 
                  case 3:
                  sDato = "Temperatura mínima media:";
                  break;
                 
                  case 4:
                  sDato = "Temperatura mínima";
                  break;
                  
                  case 5:
                  sDato = "Precipitación total";
                  break;
                  
                  case 6:
                  sDato = " Días de lluvia";
                  break;
                  
                  case 7:
                  sDato = "Días de nevadas ";
                  break;
                          
                  case 8:
                  sDato = "Horas de sol";
                  break;
                  
                  case 9:
                  sDato = " Humedaad relativa";
                  break;
        }
        System.out.println("En "+sMes+ " la "+sDato+ " es de "+vRes);
        
        
        
        
 
        
        /*
        System.out.println(aiArray.length);
        System.out.println(aiArray[0].length);
        
        switch (vMes) {
            case 1:
                
                double Enero = aiArray[0][0];
                System.out.println("Enero");
                
                switch (vDat){
                 case 1 :
                  Enero = aiArray [1][0];
                     break;
                 case 2:
                     Enero = aiArray [2][0];
                     break;
                 case 3 :
                     Enero = aiArray [3][0];
                 break;
                 case 4 :
                     Enero = aiArray [4][0];
                 break;
                 case 5 :
                     Enero = aiArray [5][0];
                 break;
                 case 6 :
                     Enero = aiArray [6][0];
                 break;
                 case 7 :
                     Enero = aiArray [7][0];
                 break;
                 case 8 :
                     Enero = aiArray [8][0];
                 break;case 9 :
                     Enero = aiArray [9][0];
                 break;
                 case 10 :
                     Enero = aiArray [10][0];
                   
                 break;
                 
             }

            case 2:
                double Febrero = aiArray[1][0];
                switch (vDat){
                 case 1:
                  Febrero= aiArray [0][1];
                     break;
                     case 2:
                  Febrero= aiArray [2][0];
                     break;
                     case 3:
                  Febrero= aiArray [3][0];
                     break;
                     case 4:
                  Febrero= aiArray [4][0];
                     break;
                     case 5:
                  Febrero= aiArray [5][0];
                     break;
                     case 6:
                  Febrero= aiArray [6][0];
                     break;
                     case 7:
                  Febrero= aiArray [7][0];
                     break;
                     case 8:
                  Febrero= aiArray [8][0];
                     break;
                     case 9:
                  Febrero= aiArray [9][0];
                     break;
                     case 10:
                  Febrero= aiArray [10][0];
                     break;
             }
                
                
                case 3:
                double Marzo = aiArray[0][2];
                System.out.println("Marzo");
                switch (vDat){
                 case 1:
                  Marzo= aiArray [1][0];
                     break;
                     case 2:
                  Marzo= aiArray [2][0];
                     break;
                     case 3:
                  Marzo= aiArray [3][0];
                     break;
                     case 4:
                  Marzo= aiArray [4][0];
                     break;
                     case 5:
                  Marzo= aiArray [5][0];
                     break;
                     case 6:
                  Marzo= aiArray [6][0];
                     break;
                     case 7:
                  Marzo= aiArray [7][0];
                     break;
                     case 8:
                  Marzo= aiArray [8][0];
                     break;
                     case 9:
                  Marzo= aiArray [9][0];
                     break;
                     case 10:
                  Marzo= aiArray [10][0];
                     break;
             }
                
                case 4:
                double Abril = aiArray[0][3];
                System.out.println("Abril");
                switch (vDat){
                    case 1:
                  Abril= aiArray [1][0];
                     break;
                     case 2:
                  Abril= aiArray [2][0];
                     break;
                     case 3:
                  Abril= aiArray [3][0];
                     break;
                     case 4:
                  Abril= aiArray [4][0];
                     break;
                     case 5:
                  Abril= aiArray [5][0];
                     break;
                     case 6:
                  Abril= aiArray [6][0];
                     break;
                     case 7:
                  Abril= aiArray [7][0];
                     break;
                     case 8:
                  Abril= aiArray [8][0];
                     break;
                     case 9:
                  Abril= aiArray [9][0];
                     break;
                     case 10:
                  Abril= aiArray [10][0];
                     break;
                              }
                
                case 5:
                double Mayo = aiArray[0][4];
                System.out.println("Mayo");
                switch (vDat){
                 case 1:
                  Mayo= aiArray [1][0];
                     break;
                     case 2:
                  Mayo= aiArray [2][0];
                     break;
                     case 3:
                  Mayo= aiArray [3][0];
                     break;
                     case 4:
                  Mayo= aiArray [4][0];
                     break;
                     case 5:
                  Mayo= aiArray [5][0];
                     break;
                     case 6:
                  Mayo= aiArray [6][0];
                     break;
                     case 7:
                  Mayo= aiArray [7][0];
                     break;
                     case 8:
                  Mayo= aiArray [8][0];
                     break;
                     case 9:
                  Mayo= aiArray [9][0];
                     break;
                     case 10:
                  Mayo= aiArray [10][0];
                     break;
             }
                
                case 6:
                double Junio = aiArray[0][5];
                System.out.println("Junio");
                switch (vDat){
                 case 1:
                  Junio= aiArray [1][0];
                     break;
                     case 2:
                  Junio= aiArray [2][0];
                     break;
                     case 3:
                  Junio= aiArray [3][0];
                     break;
                     case 4:
                  Junio= aiArray [4][0];
                     break;
                     case 5:
                  Junio= aiArray [5][0];
                     break;
                     case 6:
                  Junio= aiArray [6][0];
                     break;
                     case 7:
                  Junio= aiArray [7][0];
                     break;
                     case 8:
                  Junio= aiArray [8][0];
                     break;
                     case 9:
                  Junio= aiArray [9][0];
                     break;
                     case 10:
                  Junio= aiArray [10][0];
                     break;
                     
             }
                
                case 7:
                double Julio = aiArray[0][6];
                System.out.println("Febrero");
                switch (vDat){
                 case 1:
                  Julio= aiArray [1][0];
                     break;
                     case 2:
                  Julio= aiArray [2][0];
                     break;
                     case 3:
                  Julio= aiArray [3][0];
                     break;
                     case 4:
                  Julio+= aiArray [4][0];
                     break;
                     case 5:
                  Julio= aiArray [5][0];
                     break;
                     case 6:
                  Julio= aiArray [6][0];
                     break;
                     case 7:
                  Julio= aiArray [7][0];
                     break;
                     case 8:
                  Julio= aiArray [8][0];
                     break;
                     case 9:
                  Julio= aiArray [9][0];
                     break;
                     case 10:
                  Julio= aiArray [10][0];
                     break;
             }
                
               case 8:
                double Agosto = aiArray[0][7];
                System.out.println("Agosto");
                switch (vDat){
                 case 1:
                  Agosto= aiArray [1][0];
                     break;
                     case 2:
                  Agosto= aiArray [2][0];
                     break;
                     case 3:
                  Agosto= aiArray [3][0];
                     break;
                     case 4:
                  Agosto= aiArray [4][0];
                     break;
                     case 5:
                  Agosto= aiArray [5][0];
                     break;
                     case 6:
                  Agosto= aiArray [6][0];
                     break;
                     case 7:
                  Agosto= aiArray [7][0];
                     break;
                     case 8:
                  Agosto= aiArray [8][0];
                     break;
                     case 9:
                  Agosto= aiArray [9][0];
                     break;
                     case 10:
                  Agosto= aiArray [10][0];
                     break;
             }
                  
                case 9:
                double Septiembre = aiArray[0][8];
                System.out.println("Septiembre");
               switch (vDat){
                 case 1:
                  Septiembre= aiArray [1][0];
                     break;
                     case 2:
                  Septiembre= aiArray [2][0];
                     break;
                     case 3:
                  Septiembre= aiArray [3][0];
                     break;
                     case 4:
                  Septiembre= aiArray [4][0];
                     break;
                     case 5:
                  Septiembre= aiArray [5][0];
                     break;
                     case 6:
                  Septiembre= aiArray [6][0];
                     break;
                     case 7:
                  Septiembre= aiArray [7][0];
                     break;
                     case 8:
                  Septiembre= aiArray [8][0];
                     break;
                     case 9:
                  Septiembre= aiArray [9][0];
                     break;
                     case 10:
                  Septiembre= aiArray [10][0];
                     break;
             }
                
                case 10:
                double Octubre = aiArray[0][9];
                System.out.println("Octubre");
                switch (vDat){
                 case 1:
                  Octubre= aiArray [1][0];
                     break;
                     case 2:
                  Octubre= aiArray [2][0];
                     break;
                     case 3:
                  Octubre= aiArray [3][0];
                     break;
                     case 4:
                  Octubre= aiArray [4][0];
                     break;
                     case 5:
                  Octubre= aiArray [5][0];
                     break;
                     case 6:
                  Octubre= aiArray [6][0];
                     break;
                     case 7:
                  Octubre= aiArray [7][0];
                     break;
                     case 8:
                  Octubre= aiArray [8][0];
                     break;
                     case 9:
                  Octubre= aiArray [9][0];
                     break;
                     case 10:
                  Octubre= aiArray [10][0];
                     break;
             }
                
                case 11:
                double Noviembre = aiArray[0][10];
                System.out.println("Noviembre");
                switch (vDat){
                 case 1:
                  Noviembre= aiArray [1][0];
                     break;
                     case 2:
                  Noviembre+= aiArray [2][0];
                     break;
                     case 3:
                  Noviembre= aiArray [3][0];
                     break;
                     case 4:
                  Noviembre+= aiArray [4][0];
                     break;
                     case 5:
                  Noviembre= aiArray [5][0];
                     break;
                     case 6:
                  Noviembre= aiArray [6][0];
                     break;
                     case 7:
                  Noviembre+= aiArray [7][0];
                     break;
                     case 8:
                  Noviembre+= aiArray [8][0];
                     break;
                     case 9:
                  Noviembre= aiArray [9][0];
                     break;
                     case 10:
                  Noviembre+= aiArray [10][0];
                     break;
             }
                
                case 12:
                double Diciembre = aiArray[0][11];
                System.out.println("Diciembre");
                switch (vDat){
                 case 1:
                  Diciembre= aiArray [1][0];
                     break;
                     case 2:
                  Diciembre= aiArray [2][0];
                     break;
                     case 3:
                  Diciembre= aiArray [3][0];
                     break;
                     case 4:
                  Diciembre= aiArray [4][0];
                     break;
                     case 5:
                  Diciembre= aiArray [5][0];
                     break;
                     case 6:
                  Diciembre= aiArray [6][0];
                     break;
                     case 7:
                  Diciembre= aiArray [7][0];
                     break;
                     case 8:
                  Diciembre= aiArray [8][0];
                     break;
                     case 9:
                  Diciembre= aiArray [9][0];
                     break;
                     case 10:
                  Diciembre= aiArray [10][0];
                     break;
             }
                case 13:
                double Anual = aiArray[0][12];
                System.out.println("Anual");
                switch (vDat){
                 case 1:
                  Anual= aiArray [1][0];
                     break;
                     case 2:
                  Anual= aiArray [2][0];
                     break;
                     case 3:
                  Anual= aiArray [3][0];
                     break;
                     case 4:
                  Anual= aiArray [4][0];
                     break;
                     case 5:
                  Anual= aiArray [5][0];
                     break;
                     case 6:
                  Anual= aiArray [6][0];
                     break;
                     case 7:
                  Anual= aiArray [7][0];
                     break;
                     case 8:
                  Anual= aiArray [8][0];
                     break;
                     case 9:
                  Anual= aiArray [9][0];
                     break;
                     case 10:
                  Anual= aiArray [10][0];
                     break;               
        }
                    
    }*/
        
    }
}
