package exLacosRepeticao;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);

        int num,cont=0,somaNum=0;
        float media;

        System.out.print("Informe um n�mero: ");
        num=leia.nextInt();

        do {
        	
        	if(num%3==0) {
        		cont++;
                somaNum+=num;
        	}
            
            System.out.print("Informe um n�mero: ");
            num=leia.nextInt();

        } while(num!=0);

        media=somaNum/cont;
        System.out.printf("A soma dos n�meros multiplos de 3 � "+somaNum+" e sua m�dia � de %.2f",media);
       
    }
}