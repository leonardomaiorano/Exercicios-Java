package exLacosDecisao;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.print("Digite o número 1: ");
		n1 = leia.nextInt();
		System.out.print("Digite o número 2: ");
		n2 = leia.nextInt();
		System.out.print("Digite o número 3: ");
		n3 = leia.nextInt();
		
		if(n1 < n2 && n2 < n3) {
			System.out.printf("Ordem crescente dos números informados: "+n1+", "+n2+", "+n3);
		} else if((n1 < n2 && n3 < n2) && n1 < n3){
			System.out.printf("Ordem crescente dos números informados: "+n1+", "+n3+", "+n2);
		}else if(n2 < n1 && n1 < n3) {
			System.out.printf("Ordem crescente dos números informados: "+n2+", "+n1+", "+n3);
		} else if(n2 < n1 && n2 < n3) {
			System.out.printf("Ordem crescente dos números informados: "+n2+", "+n3+", "+n1);
		} else if(n3 < n1 && n1 < n2) {
			System.out.printf("Ordem crescente dos números informados: "+n3+", "+n1+", "+n2);
		} else {
			System.out.printf("Ordem crescente dos números informados: "+n3+", "+n2+", "+n1);
		}
	}
}