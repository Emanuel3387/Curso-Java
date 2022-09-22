package oo.composicao;

public class Motor { // calsse
	
	final Carro carro;
	boolean ligado = false; // comportamento
	double fatorInjecao = 1; // comportamento
		
	// metado bidirecional
	Motor(Carro carro){
		this.carro = carro;
	}
	//metado
	int giros() {
		if(!ligado) {
			return 0;
		}else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}

}
