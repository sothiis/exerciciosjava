
package javaapplication65;

/**
 *
 * @author jamille
 */
public class JavaApplication65 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int idade [] = {25,26,29,40,2,88,90,105,-60,689,88}; 
//    tamanho do vetor = 5, indice 0 ate o 4
     int max = idade [0];
     int min = idade[0];
     int imax = 0;
     int imin = 0;
     
     for (int i=0;i<idade.length;i++) {
        if (idade[i]>max) {
            max = idade[i];
            imax = i;
            }
        
        if (idade[i]<min) {
            min = idade [i];
            imin = i;
        }
         
       
    }
//     depois do for o print
     System.out.println(imax +")máximo: " + max);
     System.out.println(imin +")minimo: " + min);
  
    
    
    
    
    
        
        
        
    }
    
}
