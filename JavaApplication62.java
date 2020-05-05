/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication62;

import java.util.Scanner;

/**
 *
 * @author jamille
 */
public class JavaApplication62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade[];
        System.out.println("digite a quantidade de pessoas:");
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        idade = new int [n];
        
        for (int i=0; i<n; i++) {
            System.out.println("qual sua idade?");
            idade[i] = sc.nextInt();
            System.out.println("sua idade é:  " + idade[i] +  " anos");
            
        }
    }
    
}
