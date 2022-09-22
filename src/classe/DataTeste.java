package classe;

public class DataTeste {
	
	public static void main(String[] args) {

		Data data1 = new Data();
		data1.dia = 3;
		data1.mes = 3;
		data1.ano = 1987;
						
		var data2 = new Data(10,12,2020);
		
		var data3 = new Data(); //* OBS data padrão prefixiada na Clase Data no Contrutor padrão como se trata de uma variavel podemos alterar ou não seu conteudo como no EX:
		data3.ano = 2022;
						
		System.out.printf("Dia: " + data1.dia + " Mes: " + data1.mes + " Ano: " + data1.ano);
		System.out.printf("Dia: " + data2.dia + " Mes: " + data2.mes + " Ano: " + data2.ano);
		System.out.printf("Dia: " + data3.dia + " Mes: " + data3.mes + " Ano: " + data3.ano);
		
		System.out.printf("\n%d/%d/%d", data1.dia, data1.mes, data1.ano);
		System.out.printf("\n%d/%d/%d", data2.dia, data2.mes, data2.ano);
		System.out.printf("\n%d/%d/%d", data3.dia, data3.mes, data3.ano);
		
		System.out.printf("\nData: " + data1.obterDataFormatada());
		System.out.printf("\nData: " + data2.obterDataFormatada());
		System.out.printf("\nData: " + data3.obterDataFormatada());
		

	}

}
