package classe;

public class AreaCircTeste {

	public static void main(String[] args) {

		AreaCirc a1 = new AreaCirc(10);
		// ai.pi = 100000;  
		
		AreaCirc a2 = new AreaCirc(5);
		// a2.pi = 0;
		
		AreaCirc.pi = 3.1415; // forma correta de se alterar o valor de uma variavel de classe com seu valor estatico
		
		System.out.println(a1.area());
		System.out.println(a2.area());

	}
}
