/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import java.util.Scanner;

/**
 *
 * @author jamille
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
     String s1, s2, s3;
     int y;
     y = sc.nextInt();
     sc.nextLine();
     s1 = sc.nextLine();
     s2 = sc.nextLine();
     s3 = sc.nextLine();
      System.out.println("dados digitados");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(y);

    }
    
}
