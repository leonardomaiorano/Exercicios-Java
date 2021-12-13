/*
Escreva um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.
 */

package exArrays;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1[][] = new int[2][2];
		int n2[][] = new int[2][2];
		int m1[][] = new int[2][2];
		int m2[][] = new int[2][2];
		int linha, coluna;

        for(linha=0; linha<2; linha++) {
        	
            for(coluna=0; coluna<2; coluna++) {
                System.out.print("Digite um numero: ");
                n1[linha][coluna]=leia.nextInt();
            }
            
        }

        for(linha=0; linha<2; linha++) {
        	
            for(coluna=0; coluna<2; coluna++) {
            	System.out.print("Digite um numero: ");
            	n2[linha][coluna]=leia.nextInt();
            }
            
        }
        
        System.out.print("\n");
        System.out.print("M1 \n");

        for(linha=0;linha<2;linha++) {
        	
            for(coluna=0;coluna<2;coluna++) {            	
                m1[linha][coluna] = (n1[linha][coluna] + n2[linha][coluna]);
                System.out.print(m1[linha][coluna]+" ");
            }
            
            System.out.print("\n");
            
       }

       System.out.print("\n");
       System.out.print("M2 \n");
        
       for(linha=0;linha<2;linha++) {
    	   
    	   for(coluna=0;coluna<2;coluna++) {
        		 
    		   m2[linha][coluna] = (n1[linha][coluna] - n2[linha][coluna]);
    		   System.out.print(m2[linha][coluna]+" ");
        		
        	 }
        	 
       System.out.print("\n");
       
       }
	}
}
