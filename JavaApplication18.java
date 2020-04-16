/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author jamille
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String product1 = "computer";
        String product2 = "office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        
        System.out.println("Products");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);
        System.out.printf("record: %d years old, code %d and gender %c ", age, code, gender);
        System.out.println();
        System.out.printf("%.8f%n", measure);
        System.out.printf("%.3f%n", measure);
    }
    
}
