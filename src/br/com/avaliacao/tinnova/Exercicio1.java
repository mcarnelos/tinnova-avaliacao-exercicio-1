package br.com.avaliacao.tinnova;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Votos votos = new Votos();
		
		
		System.out.println("Total de Eleitores: " + votos.getTotalEleitores());

		System.out.println("Percentual de votos válidos: " + votos.votosValidos() + "%");
		
		System.out.println("Percentual de votos brancos: " + votos.votosBrancos() + "%");
		
		System.out.println("Percentual de votos nulos: " + votos.votosNulos() + "%");
	}

}
