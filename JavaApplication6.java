/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author GPers
 */
public class JavaApplication6 {

    static void imprime_matriz(String [][] mat){
//        função
        
//        primeiro for varre as linhas
        for (int i =0;i<mat.length;i++) {
            
//        segundo for varre as colunas
//        length tamanho de linhas
            for (int j=0;j<mat[i].length;j++){
                
//          imprime
                System.out.print(mat[i][j]+"");
            }
            System.out.println(":"+  mat[i].length);
            System.out.println("");
        }
    }
    public static void main(String[] args) {
      
      String gatos [][]={{"Bella"," Roselia"," da"," Gama"},
                         {"Styles" ," Tomlinson"},
                         {"Payne"," Malik", " Tommo"}};
      
       
      for (int i=0;i<gatos.length;i++){
        System.out.println("Bem vinda "+gatos[i][0]+" "+gatos[i][gatos[i].length-1]);
                
    }
//      mesma coisa que esta em cima
//      System.out.println("Bem vinda "+ gatos[0][0]+gatos[0][gatos[0].length-1]);
//        System.out.println("Bem vindo "+ gatos[1][0]+gatos[1][gatos[1].length-1]);
//        System.out.println("Bem vindo "+ gatos[3][0]+gatos[1][gatos[3].length-1]);
    }
 
    
}
