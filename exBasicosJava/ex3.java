package exBasicosJava;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

        int totalSec, hour, min, sec;
        
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantos segundos de duração teve o evento? ");
        totalSec = leia.nextInt();

        hour = totalSec/3600;
        min = (totalSec-(hour*3600))/60;
        sec = (totalSec % 60);

        System.out.println("O evento teve duração de "+hour+" hora(s), "+min+" minuto(s) e "+sec+" segundo(s)");

    }

}