package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && ! condicao2); // v
		System.out.println(condicao1 || condicao2); // v
		System.out.println(condicao1 ^ condicao2); // v 
		System.out.println(condicao1 && condicao2); // v
		System.out.println(!condicao1); // v
		System.out.println(!condicao2); // v
		
		System.out.println("\n Tabela verade  E (AND)"); // somente e verdadeiro quando todas as condi��es s�o verdadeiras.
		
		System.out.println(true && true); // v
		System.out.println(true && false); // f
	//	System.out.println(false && true); // f
	//	System.out.println(false && false); // f
		
		System.out.println("\n Tabela verade  OU (OR) "); // Somente � falso quando todas as condi��es s�o falsas. 
		
	//	System.out.println(true || true); // v
	//	System.out.println(true || false); // v
		System.out.println(false || true); // v
		System.out.println(false || false); // f
		
		System.out.println("\n Tabela verade  OU Exclusivo (XOR) "); // Utilizado para condi��es duplas sendo verdadeiro somente quando as condi��es s�o diferentes, 
																  //para condi��es iguais o resultado e falso.
		
		System.out.println(true ^ true); // f
		System.out.println(true ^ false); // v
		System.out.println(false ^ true); // v
		System.out.println(false ^ false); // f
		
		
		System.out.println("\n Tabela verade  OU Exclusivo (XOR) ");
		
		System.out.println(!true); // f
		System.out.println(!false); // v
		

	}

}
