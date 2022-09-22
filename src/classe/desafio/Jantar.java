package classe.desafio;

public class Jantar {
	
	public static void main(String[] args) {

		Comida c1 = new Comida("Arroz", 1.333);
		Comida c2 = new Comida("Feijão", 1.444);
		
		Pessoa p1 = new Pessoa("João", 85.908);
		Pessoa p2 = new Pessoa("Maria", 67.999);
		
		System.out.println(p1.apresentar());	
		p1.comer(c1);
		System.out.println(p1.apresentar());
		p1.comer(c2);
		System.out.println(p1.apresentar());
		
		System.out.println(p2.apresentar());
		p2.comer(c1);
		System.out.println(p2.apresentar());
		p2.comer(c2);
		System.out.println(p2.apresentar());
	}

}
