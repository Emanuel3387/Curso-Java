package fundamentos;

public class DesafioAritimeticos {

	public static void main(String[] args) {
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiaorA = numA / denA;
		double superiaorB = Math.pow(numB / denB , 2);
		
		double superior = Math.pow(superiaorA - superiaorB, 3);
		double infeiror = Math.pow(10, 3);
		
		double resultado = superior / infeiror;
		System.out.println(" O resultado é: " + resultado) ;
	}

}





/*
 * int a = 3 * 4 - 10; int b = (int) Math.pow(a, 3); double c = Math.pow(a, 3);
 * 
 * System.out.println(b); System.out.println(c);
 */