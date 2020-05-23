/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication78;

/**
 *
 * @author jamille
 */
public class JavaApplication78 {

    /**
     * @param args the command line arguments
     */
//    metodo com retorno e com parametros
    public static void main(String[] args) {
    int valorretornado = somar (10,50);
        System.out.println("a soma é: " + valorretornado);
    }
    
    static int somar (int n1, int n2) {
        int resultado;
        resultado = n1+n2;
        return resultado;
    }
}
