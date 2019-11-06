/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSets;

import java.util.Scanner;

public class DataSets {

    public static void main(String[] args) {

        int linha, coluna, cont=0;
        String res = "", items = "", users="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da linha na matriz");
        linha = scanner.nextInt();
        System.out.println("Digite o valor da coluna na matriz");
        coluna = scanner.nextInt();

        System.out.println("A matriz é " + linha + " X " + coluna);

        double[][] matriz = new double[linha][coluna];
        //double[][] dados = new double[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.println("Digite um número para a matriz " + i + " linha " + j + " coluna");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
               
                if(cont == 0){
                    res += "users" + i + " |";
                    cont++;
                }
                res += matriz[i][j] + "   |";
                cont++;
                if (j == coluna-1) {
                    res += "\n";
                     cont=0;
                     
                }

            }
        }
        
        for (int i = 0; i < coluna; i++) {
            if(i == 0){
                items +="        " +"items"+ i+ "|"; 
            }else{
                 items += "items"+ i+ "|";
            }
           
        }
        
         for (int i = 0; i < linha; i++) {
           
        }
        System.out.println(items);
        System.out.println(res);
    }

}
