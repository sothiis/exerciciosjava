/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication71;

import java.util.Scanner;

/**
 *
 * @author jamille
 */
public class JavaApplication71 {

   public static double sen_cos (double cos, double sen) {
       double x_sen = Math.toRadians(sen);
       double sen_x = Math.sin(x_sen);
       double x_cos = Math.toRadians(cos);
       double cos_x = Math.cos(x_cos);
       
       if (cos_x==0) {
           System.out.println("nāo existe resposta");
           return 0;
       } else {
         double resposta =  (sen_x/cos_x);
         return resposta;
       }
       
       
   }
    
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
        System.out.println("digite um angulo x em graus:");
        double x_graus = sc.nextDouble();
       
        System.out.println("digite um angulo y em graus:");
        double y_graus = sc.nextDouble();
        System.out.println(sen_cos(x_graus, y_graus ));
        
        
        
    }
    
}
