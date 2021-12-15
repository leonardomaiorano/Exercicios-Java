package Encapsulamento;

public class Controle  implements InterControle {
	//ATRIBUTOS DA CLASSE
	private int vol;
	private boolean ligado;
	private int canal;
	
	//METODO CONSTRUTOR
	public Controle () {
		this.vol=50;
		this.ligado=false;
		this.canal=554;
	}
	
	//METODOS GETS E SETS
	private int getVol() {
		return vol;
	}

	private void setVol(int vol) {
		this.vol = vol;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private int getCanal() {
		return canal;
	}

	private void setCanal(int canal) {
		this.canal = canal;
	}
	
	public void status() {
		System.out.println("A TV est� ligada? "+ligado);
		System.out.println("O volume est� em "+vol+"%");
		System.out.println("Est� sintonizada no canal: "+canal);
	}

	//METODOS DA INTERFACE
	@Override
	public void ligar() {
		if(this.ligado==false) {
			this.ligado=true;
		}
	}

	@Override
	public void desligar() {
		if(this.ligado==true) {
			this.ligado=false;
		}
		
	}

	@Override
	public void maisVol() {
		if(getLigado()==true) {
			setVol(getVol()+1);
		}
	}

	@Override
	public void menosVol() {
		if(getLigado()==true) {
			setVol(getVol()-1);
		}
	}

	@Override
	public void canalUp() {
		if(getLigado()==true) {
			setCanal(getCanal()+1);
		}
	}

	@Override
	public void canalDown() {
		if(getLigado()==true) {
			setCanal(getCanal()-1);
		}
	}
}