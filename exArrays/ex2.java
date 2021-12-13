/*
Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
 */

package exArrays;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		int dado[] = new int[10];
		int x,somaDado=0,media,dado6=0;
		
		Scanner leia = new Scanner(System.in);

				for(x=0;x<10;x++) {
					System.out.print("\nDigite o valor do dado: ");
					dado[x]=leia.nextInt();
					somaDado+=dado[x];

					if(dado[x]==6) {
						dado6++;
					}
				}

				for(x=0;x<10;x++) {
					System.out.print("["+dado[x]+"]  ");
				}
				media=somaDado/10;
				System.out.print("\nA média dos valores dos dados é: "+media);
				System.out.print("\nO número 6 ocorreu "+dado6+" vez(es)");
	}
}