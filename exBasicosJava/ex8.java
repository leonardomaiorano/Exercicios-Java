package exBasicosJava;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double custoF,custoC;
		
		System.out.print("\nEntre com o custo de fábrica: ");
		custoF=leia.nextFloat();
		
		custoC = custoF + (custoF*0.73);
		
		System.out.printf("\nCusto ao consumidor R$ %.2f",custoC);
		
	}

}