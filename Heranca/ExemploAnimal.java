package Heranca;

public class ExemploAnimal {

	public static void main(String[] args) {

		ex1Cachorro cachorro = new ex1Cachorro("Beethoven", 8, true);
		cachorro.setSom("Au au");
		
		ex1Cavalo cavalo = new ex1Cavalo("Pé de Pano", 12, true);
		cavalo.setSom("IHIHIHIHI");
		
		ex1Preguica preguica = new ex1Preguica("Stitch", 20, true);
		preguica.setSom("zZZzzzzZZz");
	
		cachorro.imprimirInfo();
		cachorro.imprimirMovimento();
		
		cavalo.imprimirInfo();
		cavalo.imprimirMovimento();
		
		preguica.imprimirInfo();
		preguica.imprimirMovimento();
		System.out.println(" ");
		
		ex1Animal[] animais = new ex1Animal[3];
		animais[0] = cachorro;
		animais[1] = cavalo;
		animais[2] = preguica;
		
		for(ex1Animal animal:animais) {
			System.out.println(animal.getSom());
		}
	}
}