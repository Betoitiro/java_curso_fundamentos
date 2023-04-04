package operadores;

public class conversao_entre_variaveis {

	public conversao_entre_variaveis() {
	}

	public static void main(String[] args) {
	
		double a = 1; //conversão implicita
		
		float b = (float)1.0; //conversão explicita cast
		
		int c = 130;
		//byte d = (byte)c; explicita
		//nesse caso daria errado, ja que o tipo int, é superior 
		//ao tipo byte
		
		double e = 1.999;
		int f = (int) e;//conversão explicita usando cast
		//o resultado desse f sera 1, mesmo o e sendo 1.999
		//seguindo a analogia do java cast
		
				
		System.out.println(a);
		System.out.println(b);
		System.out.println(f);
	}
}
