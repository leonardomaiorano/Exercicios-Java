package POO;

public class Aviao {

    private String modelo;
    private String cor;
    private String companhia;
    private int ano;

    public Aviao (String modelo, String cor, String companhia, int ano)
    {
        this.modelo = modelo;
        this.cor = cor;
        this.companhia = companhia;
    }

    public void imprimirInfo()
    {
        System.out.println("\nO avião é do modelo "+modelo+", ano "+ano+", cor "+cor+", e faz parte da frota da companhia "+companhia+".");
    }

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

   

}