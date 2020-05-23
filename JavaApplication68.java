/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication68;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jamille
 * //        Exercício 4 – Escreva um algoritmo que dado um valor numérico digitado pelo usuário
//        (armazenado em uma única variável inteira), imprima cada um dos seus dígitos por extenso. Exemplo:
//• Entrada: 4571 Resultado: quatro, cinco, sete, um
 */
public class JavaApplication68 {
// funçāo
   public static String numero(char n) {
       switch (n) {
           case '0' : return "zero";
           case '1' : return "um";
           case '2' : return "dois";
           case '3' : return "tres";
           case '4' : return "quatro";
           case '5' : return "cinco";
           case '6' : return "seis";
           case '7' : return "sete";
           case '8' : return "oito";
           case '9' : return "nove";
           
           
       }
       return null;
       
   }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("digite um numero:");
        
        String num = sc.nextLine();

//      vetor
        int numeros [] = new int [num.length()];
        
                
         for(int i=0; i<num.length();i++){
            System.out.print(numero (num.charAt(i)));
            if (i<num.length()-1) {
             System.out.print(", "); 
        }else{
                System.out.print(".");
            }
          numeros[i] = Character.getNumericValue(num.charAt(i));
       }
          
         System.out.println("\n"+Arrays.toString(numeros));
    }
}