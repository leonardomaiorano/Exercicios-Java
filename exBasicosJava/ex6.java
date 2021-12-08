package exBasicosJava;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {

        double x1, x2, y1, y2, dx, dy, dxy, distPontos;
        
        Scanner leia = new Scanner(System.in);

        System.out.print("\nQual o valor de x1? ");
        x1=leia.nextFloat();
        System.out.print("\nQual o valor de y1? ");
        y1=leia.nextFloat();
        System.out.print("\nQual o valor de x2? ");
        x2=leia.nextFloat();
        System.out.print("\nQual o valor de y2? ");
        y2=leia.nextFloat();

        dx=Math.pow((x2-x1), 2);
        dy=Math.pow((y2-y1), 2);
        dxy=dx+dy;
        
        distPontos=Math.sqrt(dxy);

        System.out.printf("\nA distância entre os pontos é de %.2f",distPontos);

    }

}