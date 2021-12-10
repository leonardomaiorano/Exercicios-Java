package exLacosRepeticao;

import java.util.Scanner;

public class ex2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x, numero, par=0, impar=0;
			
		for (x=1;x<=10;x++) {
			
			System.out.print("Digite o "+x+"o. numero: ");
			numero = leia.nextInt();
			
			if(numero%2==0) {
				par++;
			} else {
				impar++;
			}
			
		}
		
		System.out.println("Foram digitados "+par+" numeros pares e "+impar+" impares!");
	}
}
