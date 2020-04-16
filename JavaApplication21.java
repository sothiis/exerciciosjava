/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author jamille
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        exercicio
       Scanner sc = new Scanner(System.in);
      String x;
      x= sc.next();
//      permite que seja digitada uma palavra e seja armazenada dentro da variavel x, e o next esta aguardando digitar algo
System.out.println("voce digitou:  " + x);
       
       
       sc.close();
//       encerra o recurso sc

        
    }
    
}
