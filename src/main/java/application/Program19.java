/*
 * Ler uma matriz com n elementos e informar quantos numeros negativos tem e
 * qual a diagonal principal.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andressa Silva
 */
public class Program19 {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter matrix order: ");
        int n = sc.nextInt();
        
        int [][] mat = new int[n][n];
        System.out.println();
        
        int countNeg = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
             System.out.printf("Enter element line %d column %d: ", i, j);
             mat[i][j] = sc.nextInt();
             
             if(mat[i][j] < 0){
                 countNeg++;
             }
            }
            System.out.println();
        }
        System.out.println("Matrix: ");
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Main diagonal: ");
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i] == mat[j]){
                    System.out.println(mat[i][j]);
                }
            }
        }
        System.out.printf("%n%n");
        System.out.println("Negative numbers: " +countNeg);
    }
}
