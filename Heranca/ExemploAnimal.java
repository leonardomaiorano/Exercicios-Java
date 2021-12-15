package Heranca;

public class ExemploAnimal {

	public static void main(String[] args) {

		ex1Cachorro cachorro = new ex1Cachorro("Beethoven", "Au au", 8, true);
		ex1Cavalo cavalo = new ex1Cavalo("Pé de Pano", "IHIHIHIHI", 12, true);
		ex1Preguica preguica = new ex1Preguica("Stitch", "ZzZzZzzzZz", 20, true);
		
		cachorro.imprimirInfo();
		cachorro.imprimirMovimento();
		
		cavalo.imprimirInfo();
		cavalo.imprimirMovimento();
		
		preguica.imprimirInfo();
		preguica.imprimirMovimento();
		
	}

}
