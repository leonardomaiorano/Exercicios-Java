/*
Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.
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
				System.out.print("\nA m�dia dos valores dos dados �: "+media);
				System.out.print("\nO n�mero 6 ocorreu "+dado6+" vez(es)");
	}
}