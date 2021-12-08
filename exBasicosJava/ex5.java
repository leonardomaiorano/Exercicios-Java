package exBasicosJava;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

        float n1, n2, n3, media, mediaPond;
        
        Scanner leia = new Scanner(System.in);

        System.out.print("\nInformar a nota 1: ");
        n1=leia.nextFloat();
        System.out.print("\nInformar a nota 2: ");
        n2=leia.nextFloat();
        System.out.print("\nInformar a nota 3: ");
        n3=leia.nextFloat();

        media = ((n1*2)+(n2*3)+(n3*5));
        mediaPond = (media/10);

        System.out.printf("\nSua nota média foi de: %.2f",mediaPond);

    }

}