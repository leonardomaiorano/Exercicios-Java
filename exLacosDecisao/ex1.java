package exLacosDecisao;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.print("Digite o primeiro n�mero: ");
		n1 = leia.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		n2 = leia.nextInt();
		System.out.print("Digite o terceiro: ");
		n3 = leia.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.printf("O primeiro n�mero digitado, "+n1+", � o maior!");
		} else if (n2 > n1 && n2 > n3){
			System.out.printf("O segundo n�mero digitado, "+n2+", � o maior!");
		} else {
			System.out.printf("O terceiro n�mero digitado, "+n3+", � o maior!");
		}
	}
}
