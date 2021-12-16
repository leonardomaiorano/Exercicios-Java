package Heranca;

public class ex1Cachorro extends ex1Animal {

	private boolean correr;
	
	public ex1Cachorro(String nome, int idade, boolean correr) {
		
		super(nome, idade);
		this.correr=correr;
		
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
	public void imprimirMovimento() {
		if(isCorrer()==true) {
			System.out.println("Gosta de correr!");
		}
	}
	
	public void imprimirInfo() {
		System.out.println("\n---Dados do Cachorro---\nNome: "+getNome()+"\nIdade: "+getIdade());
	}
	
	public String getSom() {
		return ("Som: "+super.getSom());
	}

}
