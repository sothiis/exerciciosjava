/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jami;
import java.util.Random;
/**
 *
 * @author gabrielperseguini
 */
public class Jami {

    /**
     * @param args matriz
     */
    public static void main(String[] args) {
        Random r = new Random();
       int megasena [][] = new int [9][5];
       
       for (int i= 0;i<megasena.length;i++){
//           primeiro for para linhas 
        for (int j=0;j<megasena[i].length;j++){
//            segundo for para colunas    
//            numero de 0 a 60 e nao negativo
//            math.abs para nao sortear numero negativo
            megasena[i][j] = 1 + Math.abs(r.nextInt()%60);

            System.out.print (megasena[i][j]+ "\t ");
        }   
           System.out.println("");
       }
       
       
    }
    
}
