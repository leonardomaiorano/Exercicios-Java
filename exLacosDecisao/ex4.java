package exLacosDecisao;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float numero;
		
		System.out.print("Entre com um número: ");
		numero = leia.nextFloat();
		
		if((numero%2==0)) {
			System.out.printf("O número "+numero+" é par e sua raíz quadrada é "+Math.sqrt(numero));
		} else {
			System.out.printf("O número "+numero+" é impar e elevado ao quadrado é "+Math.pow(numero, 2));
		}
	}
}