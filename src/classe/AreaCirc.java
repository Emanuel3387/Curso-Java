package classe;

public class AreaCirc {
	
	double raio;
	static double pi = 3.1415;
	
	 AreaCirc(double raioinicial) {
		 pi = 3.14;
		 raio = raioinicial;
	}
	 
	 double area( ) {
		 return pi * Math.pow(raio, 2);
	 }

}
