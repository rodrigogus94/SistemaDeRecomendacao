/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSets;

import java.util.Scanner;

public class DataSets {

    public static void main(String[] args) {

        int linha, coluna, cont = 0, contArray = 0;
        double soma = 0, mult = 0, div = 0;
        String res = "", items = "", users = "", posicao = "", res2 = "", most = "", mostM = "";
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
        //Mostra a matriz pronta
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {

                if (cont == 0) {
                    res += "users" + i + " |";
                    cont++;
                }

                res += matriz[i][j] + "   |";
                cont++;
                if (j == coluna - 1) {
                    res += "\n";
                    cont = 0;

                }

            }
        }
        //conta as posições de zero na matriz
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (matriz[i][j] == 0) {
                    posicao += i + "." + j + ", ";

                }
            }

        }
        //Multiplicação da matriz Calculo PA
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (matriz[i][j] == 0) {
                    for (int k = 0; k < linha; k++) {
                        most += k + "." + j + ",";
                        mostM += matriz[k][j] + ", ";
                        mult += matriz[k][j] * matriz[k][j+1];
                       
                    }

                }
                 break;
            }
        }
        //mostra a matriz pronta depois da soma
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {

                if (cont == 0) {
                    res2 += "users" + i + " |";
                    cont++;
                }

                res2 += matriz[i][j] + "   |";
                cont++;
                if (j == coluna - 1) {
                    res2 += "\n";
                    cont = 0;

                }

            }
        }

        for (int i = 0; i < coluna; i++) {
            if (i == 0) {
                items += "        " + "items" + i + "|";
            } else {
                items += "items" + i + "|";
            }

        }

        System.out.println("posição: " + posicao);
        System.out.println(items);
        System.out.println(res);
        System.out.println(items);
        System.out.println(res2);
        System.out.println("most " + most);
        System.out.println("mostM " + mostM);
        System.out.println("Mult " + mult);

    }

}
