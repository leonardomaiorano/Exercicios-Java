package exLacosRepeticao;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int num=1000;

        for(num=1000;num<=1999;num++)
        {
            if(num%11 == 5)
            {
                System.out.println("\n"+num);
            }

        }
    }
}