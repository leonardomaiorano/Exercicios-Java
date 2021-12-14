package POO;

import java.util.Scanner;

public class AviaoTeste {

    public static void main(String[] args) {
    
    	Scanner leia = new Scanner(System.in);
    	
    	String m, c, comp;
    	int a;

    	Aviao aviao1 = new Aviao (null,null,null,0);
    	
        System.out.print("Digite o modelo do avião: ");
        m=leia.next();
        aviao1.setModelo(m);
        
        System.out.print("Digite a cor do avião: ");
        c=leia.next();
        aviao1.setCor(c);
        
        System.out.print("Digite a companhia: ");
        comp=leia.next();
        aviao1.setCompanhia(comp);
        
        System.out.print("Digite o ano de fabricação: ");
        a=leia.nextInt();
        aviao1.setAno(a);

        aviao1.imprimirInfo();

    }
}