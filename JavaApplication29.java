/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import java.util.Scanner;

/**
 *
 * @author jamille
 */
public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
      int hora;
        System.out.println("quantas horas?");
        hora = sc.nextInt();
        
        if (hora<12) {
          System.out.println("bom dia");
        }
        
        else {
         System.out.println("boa tarde");
        }
        
        sc.close();
    }
    
}
