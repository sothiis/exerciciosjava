/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication79;

/**
 *
 * @author jamille
 */
public class JavaApplication79 {

    /**
     * @param args the command line arguments
     */
    static void procedimento_converterEmCM (double n){
      
           System.out.println(n*100);
    }
          
     
     static double funcao_converterEmCM (double n){
           return (n*100);
       }
     
     
    public static void main (String[] args) {
           procedimento_converterEmCM (1.8);
           System.out.println(funcao_converterEmCM(1.8));
    }
    
}
