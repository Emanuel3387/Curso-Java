package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		boolean trabalho1 = false; 
		boolean trabalho2 = true;
		
		if(trabalho1 && trabalho2) {
			System.out.println("\n Fechamos dois servi�os \n  *** familia sai para comprar tv de 50 polegadas � tamb�m vai tomar sorvete. *** ");	
		}
		
		else if(trabalho1 || trabalho2) {
			System.out.println(" Fechamos um servi�o \n  *** familia sai para comprar tv de 32 polegadas � tamb�m vai tomar sorvete *** ");
		
		}else { 
			System.out.println(" Infelismente n�o fechamos nehum trabalho. \n  ***familia vai ficar em casa*** ");
			
		}				
	}

}
/* Trabalho na ter�a (V ou F).
 * Trabalho na quinta (V ou F).
 * se um trabalho der certo familia sai para compar tv de 32.
 * se os dois trabalhos derem certo familia sai para comprar tv de 50.
 * se compar qualquer uma das tvs a familia tamb�m vai tomar sorvete.
 * se nehum trabalho de certo a familia fica em casa.
 * 
 * 
*/ 
