package exBasicosJava;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int A,B,C,R,S,D;
		
		System.out.println("\nInforme o valor de A: ");
		A=leia.nextInt();
		System.out.println("\nInforme o valor de B: ");
		B=leia.nextInt();
		System.out.println("\nInforme o valor de C: ");
		C=leia.nextInt();
		
		R=(int) Math.pow((A+B), 2);
		S=(int) Math.pow((B+C), 2);
		D=(R+S)/2;
		
		System.out.println("\nO valor de R é "+R);
		System.out.println("\nO valor de S é "+S);
		System.out.println("\nO valor de D é "+D);
		

	}
}

