package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	
	
	//* Construtor padrão OBS: O construtor tem que ter o mesmo nome da Calsse
	
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
			
	//* Métado Construtor sem parametros
	
	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato,this.dia, this.mes, this.ano);  // this e opcional nesse caso!
		
	}
	
	void imprimirDataFormatada() {
		
		System.out.println(obterDataFormatada());
	}
		
}
// Tipos primitivos e valor da  inicialização padrão.
// byte, short, int, long -> 0
// float, double -> 0.0
// char -> '\u0000' primeiro item da tabela unicode