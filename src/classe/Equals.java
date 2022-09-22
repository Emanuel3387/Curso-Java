package classe;

public class Equals {
	
	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Pedro Henrrique";
		u1.email = "PedroHR@bol.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Henrrique";
		u2.email = "PedroHQ@bol.com.br";
		
		System.out.println( u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		

	}

}
