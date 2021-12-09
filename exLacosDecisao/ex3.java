package exLacosDecisao;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite a idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14 ) {
			System.out.printf("A sua categoria é a infantil!");
		}else if(idade >= 15 && idade <= 17) {
			System.out.printf("A sua categoria é a juvenil!");
		} else if(idade >= 18 && idade <= 25) {
			System.out.printf("A sua categoria é a adulto!");
		} else {
			System.out.printf("Você não está apto para participar de nenhuma categoria!");
		}
	}
}