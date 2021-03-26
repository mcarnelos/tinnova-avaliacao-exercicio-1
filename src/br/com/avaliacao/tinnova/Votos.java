package br.com.avaliacao.tinnova;

public class Votos {

	private int totalEleitores = 1000;
	private int validos = 800;
	private int nulos = 50;
	private int brancos = 150;
	
	public Votos() {
	
	}

	public Votos(int totalEleitores, int validos, int nulos, int brancos) {
		this.totalEleitores = totalEleitores;
		this.validos = validos;
		this.nulos = nulos;
		this.brancos = brancos;
	}
	
	/*Método que retorna o percentual de votos validos*/
	
	public double votosValidos() {
		return (validos * 100) / totalEleitores;
	}
	
	/*Método que retorna o percentual de votos nulos*/
	
	public double votosNulos() {
		return (nulos * 100) / totalEleitores;
	}
	
	/*Método que retorna o percentual de votos brancos*/
	
	public double votosBrancos() {
		return (brancos * 100) / totalEleitores;
	}

	public int getTotalEleitores() {
		return totalEleitores;
	}

	public void setTotalEleitores(int totalEleitores) {
		this.totalEleitores = totalEleitores;
	}

	public int getValidos() {
		return validos;
	}

	public void setValidos(int validos) {
		this.validos = validos;
	}

	public int getNulos() {
		return nulos;
	}

	public void setNulos(int nulos) {
		this.nulos = nulos;
	}

	public int getBrancos() {
		return brancos;
	}

	public void setBrancos(int brancos) {
		this.brancos = brancos;
	}

	
	
	
	
}
