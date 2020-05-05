
package ex01;

import java.util.Scanner;

/**
 *
 * @author j
 */
public class ex01 {

    /**
     * @param args the command line arguments
     */
    
//    Nome: Jamille Bodeo RA: 21424597
//    Nome: Thiago Saito RA: 21471198
    
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
//     exercicio 1
     double x;
     System.out.println("Qual o valor do angulo x?");
     x = sc.nextDouble();
     
  
//     a
     double radianos = (Math.toRadians(x)); 
     System.out.println("O valor de x em radianos é: " + radianos); 
     
//     b
     double  seno = Math.sin(radianos);
     System.out.println("O valor do x em seno é: " + seno); 
     
//     c
   double potencia_seno = (Math.pow(seno, 2));
   System.out.println("O valor do seno ao quadrado: " + potencia_seno);
   
//   d
     double cosseno = (Math.cos(radianos));
     System.out.println("O valor do x em cosseno é: " + cosseno);
     
//     e
      double cosseno_seno = cosseno*seno;
      System.out.println("O resultado de cosseno * seno é: " + cosseno_seno);
      
    }
    
}
