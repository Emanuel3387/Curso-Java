package oo.composicao;

public class Carro {
	
	final Motor motor;
	
	Carro(){ // metado bidirecional
		this.motor = new Motor(this);
	}
		
	boolean estaLigado() {
		return motor.ligado;
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void acelerar() {
		if(motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
		}
	}
	
	void frear() {
		if(motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}
		
	void desligar() {
		motor.ligado = false;
	}	
}
