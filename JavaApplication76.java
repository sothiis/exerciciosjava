/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication76;

/**
 *
 * @author jamille
 */
public class JavaApplication76 {

    /**
     * @param args the command line arguments
     */
    //  void e com parâmetros, procedimento
    public static void main(String[] args) {
       imprimirdadosdisciplina("Igor");
           imprimirdadosdisciplina("Paxx");
    }
    
    static void imprimirdadosdisciplina (String professor) {
            System.out.println ("======================================");
    System.out.println("\tLógica de programaçāo");
    System.out.println("\tCarga horária: 80 horas ");
    System.out.println("\tProfessor: " + professor);
    System.out.println ("======================================");
    }
    
}
