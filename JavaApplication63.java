/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;

/**
 *
 * @author jamille
 */
public class JavaApplication63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nomes [] = {"harry","louis","niall","zayn"};
//              nomes [0] = "louis";
//              nomes [1] = "niall";
//              nomes [2] = "harry";
//              nomes [3] = "liam";
//              nomes [4] = "zayn";
       
        int notas [] = {10,80,30,20}; 
        
        double alturas [] = new double [4];
        alturas [0] = 1.75;
        alturas [1] = 1.85;
        alturas [2] = 1.90;
        alturas [3] = 1.70;
        
        double media = 0;
        
       
       for (int i=0; i<nomes.length; i++) {
           System.out.println((i+1)+ ") Nome: " + nomes[i]+ " \n nota: " +  notas[i]);
           System.out.println("altura: "+alturas[i]);
           media +=alturas[i];
       }
       
        System.out.println("Média da altura: " + (media/alturas.length));
       
    } 
    
}
