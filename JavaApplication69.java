/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication69;

import java.util.Arrays;

/**
 *
 * @author jamille
 */
public class JavaApplication69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int A [] = {1,9,8,9};  

     int B [] = {1,9,6,2,9};

     int C [] = new int [A.length + B.length];
     
     int j=0;

     while (j<A.length) {
         C[j]=A[j];
         j++;
     }
     int i=0;
     while (i<B.length) {
         C[j]=B[i];
         i++;
         j++;
     }

        System.out.println(Arrays.toString(C));
    }
    
}
