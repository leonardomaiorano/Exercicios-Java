package POO;

import java.util.Scanner;

public class ClienteTeste {

    public static void main(String[] args) {
    
    	Scanner leia = new Scanner(System.in);
    	
    	String n, s, e, t, i, d;

    	Cliente cliente1 = new Cliente (null,null,null,null,null,null);
    	
        System.out.print("Digite o seu nome: ");
        n=leia.next();
        cliente1.setNome(n);
        
        System.out.print("Digite o seu sexo: ");
        s=leia.next();
        cliente1.setSexo(s);
        
        System.out.print("Digite seu endere�o: ");
        e=leia.next();
        cliente1.setEndereco(e);
        
        System.out.print("Digite o seu telefone: ");
        t=leia.next();
        cliente1.setTel(t);
        
        System.out.print("Digite a sua idade: ");
        i=leia.next();
        cliente1.setIdade(i);
        
        System.out.print("Digite o No. do seu documento: ");
        d=leia.next();
        cliente1.setDoc(d);

        cliente1.imprimirInfo();

    }
}