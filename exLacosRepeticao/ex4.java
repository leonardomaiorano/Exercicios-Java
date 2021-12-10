package exLacosRepeticao;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, sexo, temp;
		int pessoas = 0, pCal = 0, mNer = 0, hAgr = 0, oCal = 0, pNerMa40 = 0, pCalMe18 = 0;
		
		while(pessoas<5) {
			
			System.out.println("Informe sua idade? ");
			idade = leia.nextInt();
			
			System.out.println("Informe o seu sexo? ");
			System.out.println("1 - Feminino");
			System.out.println("2 - Masculino");
			System.out.println("3 - Outros");
			sexo = leia.nextInt();
			
			switch(sexo) {
				case 1:
					System.out.println("Escolha seu temperamento: ");
					System.out.println("1 - Calma.");
					System.out.println("2 - Nervosa.");
					System.out.println("3 - Agressiva.");
					temp=leia.nextInt();
					if(idade<18 && temp==1) {
						pCalMe18++;
						pCal++;
					} else if(idade>40 && temp==2) {
						pNerMa40++;
						mNer++;
					} else if(temp==2) {
						mNer++;
					} else if(temp==1) {
						pCal++;
					}
					break;
				case 2:
					System.out.println("Escolha seu temperamento: ");
					System.out.println("1 - Calmo.");
					System.out.println("2 - Nervoso.");
					System.out.println("3 - Agressivo.");
					temp=leia.nextInt();
					if(idade<18 && temp==1) {
						pCalMe18++;
						pCal++;
					} else if(temp==3) {
						hAgr++;
					} else if(idade>40 && temp==2) {
						pNerMa40++;
					} else if(temp==1) {
						pCal++;
					}
					break;
				case 3:
					System.out.println("Escolha seu temperamento: ");
					System.out.println("1 - Calme.");
					System.out.println("2 - Nervose.");
					System.out.println("3 - Agressive.");
					temp=leia.nextInt();
					if(idade<18 && temp==1) {
						pCalMe18++;
						pCal++;
						oCal++;
					} else if(idade>40 && temp==2) {
						pNerMa40++;
					} else if(temp==1) {
						oCal++;
						pCal++;
					}
					break;
			}
			pessoas++;
		}
		System.out.println("O número de pessoas calmas é de: "+pCal);
		System.out.println("O número de mulheres nervosas é de: "+mNer);
		System.out.println("O número de homens agressivos é de: "+hAgr);
		System.out.println("O número de outros calmes é de: "+oCal);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é de: "+pNerMa40);
		System.out.println("O número de pessoas calmas com menos de 18 anos é de: "+pCalMe18);
	}
}
