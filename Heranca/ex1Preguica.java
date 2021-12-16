package Heranca;

public class ex1Preguica extends ex1Animal {
	
	private boolean subirArvore;
	
	public ex1Preguica(String nome, int idade, boolean subirArvore) {
		
		super(nome, idade);
		this.subirArvore=subirArvore;
		
	}

	public boolean isSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(boolean subirArvore) {
		this.subirArvore = subirArvore;
	}
	
	public void imprimirMovimento() {
		if(isSubirArvore()==true) {
			System.out.println("Gosta de escalar árvores!");
		}
	}
	
	public void imprimirInfo() {
		System.out.println("\n---Dados da Preguiça---\nNome: "+getNome()+"\nIdade: "+getIdade());
	}
	
	public String getSom() {
		return ("Som: "+super.getSom());
	}
	
}
