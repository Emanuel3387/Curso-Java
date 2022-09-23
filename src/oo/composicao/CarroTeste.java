package oo.composicao;

public class CarroTeste {
	
	public static void main(String[] args) {

		Carro c1 = new Carro();
		System.out.println("O motor est� ligado ? " + c1.estaLigado()); // retorna uum boolenao 
		
		c1.ligar(); // retorna um booleano
		
		System.out.println("O motor est� ligado ? " + c1.estaLigado()); // retorna um booleano
		
		System.out.println("Giro atual do motor �: " + c1.motor.giros()); // retorna o giro atual do motor
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println("Giro atual do motor �: " + c1.motor.giros()); // retorna o giro atual do motor
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		System.out.println("Giro atual do motor �: " + c1.motor.carro.motor.carro.motor.giros()); // bidirecioanl normalmente n�o utilizado 
		
		// Faltou encapsulamento!!!
		// c1.motor.fatorinjecao = - 30;

		
		System.out.println("Giro atual do motor �: " + c1.motor.giros()); // retorna o giro atual do motor
	}

}// teste branch Update-01 commit-02kkkkkkk
