/*
Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
 */

package exArrays;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		int x[] = new int[5];
		int valor, maiorValor = 0;
		
		Scanner leia = new Scanner(System.in);

				for(valor = 0; valor < 5; valor++) {
					
					System.out.print("Digite o valor da posi��o "+valor+": ");
					x[valor]=leia.nextInt();
					
					if(x[valor] > maiorValor) {
						maiorValor = x[valor];
					}				
				}
				System.out.println("");
				
				for(valor = 0; valor < 5; valor++) {
					System.out.println("Valor da posi��o "+valor+" � "+x[valor]);		
				}
				
				System.out.println("\nO maior valor encontrado nos n�meros informados foi "+maiorValor+"!");
				
	}
}