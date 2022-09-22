package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 0.6;
		
		// String resultadoParcial = media >= 5.0 ? " aprovado " : "  em recuperação ";
		String resultado = media >= 7.0 ? " aprovado " : "  Tem desconto ";
		
		System.out.println(" o aluno está " + resultado);

	}

}
