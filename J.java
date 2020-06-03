/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j;

/**
 *
 * @author GPers
 */
public class J {

    static void imprime_matriz(String [][] mat){
//        função
        
//        primeiro for varre as linhas
        for (int i =0;i<mat.length;i++) {
            
//        segundo for varre as colunas
//        length tamanho de linhas
            for (int j=0;j<mat[i].length;j++){
                
//          imprime
                System.out.print(mat[i][j]+"\t");
            }
//          pula a linha apos as colunas
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
//      declaração em varias linhas, acesso direto
     System.out.println("-----------------");
String nomes[][]= new String[3][2];
      
      nomes [0][0]="Jamille";
      nomes [0][1]="Gabriel";
      
      nomes [1][0]="Paxx";
      nomes [1][1]="Bellinha";
      
      nomes [2][0]="Ale";
      nomes [2][1]="Tiziu";
      
       imprime_matriz(nomes);
        System.out.println("-----------------");
//      declaração in line
      String alunos [][] = {{"Harry","Louis"},
                           {"Niall","Liam"},
                           {"Zayn", "Meowth"}};
      
      imprime_matriz(alunos);
      
      String gatos [][]={{"Bella","Roselia","da","Gama"},
          {"Styles Tomlinson"},{"Payne","Malik", "Tommo"}};
              
    }
    
}
