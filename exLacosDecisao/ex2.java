package exLacosDecisao;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.print("Digite o n�mero 1: ");
		n1 = leia.nextInt();
		System.out.print("Digite o n�mero 2: ");
		n2 = leia.nextInt();
		System.out.print("Digite o n�mero 3: ");
		n3 = leia.nextInt();
		
		if(n1 < n2 && n2 < n3) {
			System.out.printf("Ordem crescente dos n�meros informados: "+n1+", "+n2+", "+n3);
		} else if((n1 < n2 && n3 < n2) && n1 < n3){
			System.out.printf("Ordem crescente dos n�meros informados: "+n1+", "+n3+", "+n2);
		}else if(n2 < n1 && n1 < n3) {
			System.out.printf("Ordem crescente dos n�meros informados: "+n2+", "+n1+", "+n3);
		} else if(n2 < n1 && n2 < n3) {
			System.out.printf("Ordem crescente dos n�meros informados: "+n2+", "+n3+", "+n1);
		} else if(n3 < n1 && n1 < n2) {
			System.out.printf("Ordem crescente dos n�meros informados: "+n3+", "+n1+", "+n2);
		} else {
			System.out.printf("Ordem crescente dos n�meros informados: "+n3+", "+n2+", "+n1);
		}
	}
}