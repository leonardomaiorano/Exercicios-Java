package exLacosDecisao;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float numero;
		
		System.out.print("Entre com um n�mero: ");
		numero = leia.nextFloat();
		
		if((numero%2==0)) {
			System.out.printf("O n�mero "+numero+" � par e sua ra�z quadrada � "+Math.sqrt(numero));
		} else {
			System.out.printf("O n�mero "+numero+" � impar e elevado ao quadrado � "+Math.pow(numero, 2));
		}
	}
}