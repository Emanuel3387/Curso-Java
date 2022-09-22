package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c =+ b; //c = c + b;   // códigos diferentes com a mesmma função de sommar o valor de C + B.
		c -= a; // c = c - a;
		c *= b; // c = c * b;
		c /= a; // c = c % 2; 0 ou 1
		
		System.out.println(a + b + c);
		

	}

}
