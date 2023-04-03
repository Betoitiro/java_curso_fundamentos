package manipulação;

public class temperatura {

	//temperatura
	//transformando faherenheit para celsius 
	
	public static void main(String[] args) {
		
		final int N = 32;
		final double f = 5.0/9.0;
		double ff = 86;
		double c =((ff - N) * f);
		System.out.println("a temperatura em " + ff +  " graus farenheit " + " corresponde a " + c + "graus celsius");
		
		ff = 150;
		c =((ff - N) * f);

		System.out.println("a temperatura em " + ff + " graus farenheit " +" corresponde a " +c + "graus celsius");
	
	}
	
}
