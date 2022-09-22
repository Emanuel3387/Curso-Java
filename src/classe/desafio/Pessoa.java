package classe.desafio;

public class Pessoa {

	String nome;
	double peso;

	// Contrutor padr�o refeito, pois ao se criar um construtor o padr�o e perdido.
	Pessoa() {
	}
	
	// contrutor com dois parametros

	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
				
	}
	
	String apresentar() {
		return "Ola eu sou o " + nome + " e tenho: " + peso + " Kgs.";
	}
}