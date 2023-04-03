package manipulação;

public class introdução_constante_variavel {
	
	public static void main(String[] args) {
		double raio =3.4;
		final double PI =3.14159;
		///uma dica, colocar sempre o valor que atribui a constante com letra maiuscula
		// para definir uma constante faz necessario por final antes.
		
		double area = PI* raio* raio;
		
		System.out.println(area);
		
		raio= 10;
		area =PI*raio*raio;
		System.out.println("a area da circunferencia = " + area + " m2.");
		///System.out.println(pi*raio*raio);
		
	}

}
