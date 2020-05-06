/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication67;

import java.util.Random;

/**
 *
 * @author jamille
 */
public class JavaApplication67 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        jogo megasena
         Random random = new Random ();
      
          int jogo [] = new int [6];
         for (int j=0;j<25;j++) {
             for (int i =0;i<jogo.length;i++){
            jogo[i] =1+random.nextInt(60);
//            para nao repetir o numero
            if (i>=1){
                while(j<i && j!=i) {
                    if (jogo[i] == jogo[j]) {
                       jogo[i] =1+random.nextInt(60); 
                    } j++;
                }
            }   
        }
        for (int i =0;i<jogo.length;i++){
            System.out.print(" "+ jogo[i]+"\t");
//            \t para ficar tabulado
        }
             System.out.println("");
         }
         
         
         
         
         
         
         
    }
    
}
