package exLacosRepeticao;

import java.util.Scanner;

public class ex3 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x, idade = 0, menos=0, mais=0;
		
		System.out.println("Qual a idade da pessoa? ");
		idade=leia.nextInt();
			
		while(idade!=-99) {
			
			System.out.println("Qual a idade da pessoa? ");
			idade=leia.nextInt();
			
			if(idade < 21) {
				menos++;
			} else if(idade > 50){
				mais++;
			} else {
			System.out.println("Idade não computada!");
			}
			
		}
		
		System.out.println("Total de pessoas com menos de 21 anos de idade: "+menos);
		System.out.println("Total de pessoas com mais de 50 anos de idade: "+mais);
		System.out.println("Programa finalizado!");
	}
}
