/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication66;

import java.util.Random;

/**
 *
 * @author jamille
 */
public class JavaApplication66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        numeros aleatorios, sorteio
       Random random = new Random ();
       int sorteado;
       
//       numero inteiro
       sorteado = random.nextInt();
       System.out.println("numero inteiro: "+ sorteado);
       
//       inteiro entre 0 e -10
         sorteado = random.nextInt(10);
        System.out.println("inteiro entre 0 e -10: " + sorteado);

//      inteiro entre 0 e -10 e some 1 ao valor sorteado
        sorteado = 1 + random.nextInt(10);
        System.out.println("inteiro entre 0 e -10 e some 1 ao valor sorteado: "+ sorteado);
        
//        megasena 1 a 60 / 6 numeros
        int jogo [] = new int [6];
        for (int j=0;j<jogo.length;j++) {
        for (int i =0;i<jogo.length;i++){
            jogo[i] =1+random.nextInt(60);
            
        }
        for (int i =0;i<jogo.length;i++){
            System.out.print(" "+ jogo[i]+1);
        }
        
       
//      megasena 1 a 50
        System.out.println("megasena 1 a 60: "+ 1+random.nextInt(50)); 
       

        
        
        
    }
    
}
