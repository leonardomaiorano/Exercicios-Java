package exLacosRepeticao;

import java.util.Scanner;

public class ex5 {
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int n, somaN=0;
		
		System.out.println("Digite um n�mero: ");
		n = leia.nextInt();
		
		do {
			
			somaN = somaN + n;
			
			System.out.println("Digite um n�mero: ");
			n = leia.nextInt();
						
		} while(n!=0);
		
		System.out.printf("A somat�ria dos numeros digitados foi de: "+somaN);
		
	}
}
