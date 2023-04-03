package tipos_primitivos;

public class tipo_string {
	public static void main(String[] args) {
		System.out.println("Ola pessoal".charAt(2));
		
		String s = "Boa tarde";
		//s = s.toUpperCase();
		s = "Bom dia"; // possivel mudar o valor da string
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println("\n\n\n");
		System.out.println(s.startsWith("Bom"));//se a string começa ou n com a palavra boa
		System.out.println(s.toLowerCase().startsWith("bom"));
		System.out.println(s.endsWith("dia"));// verificar o fim da string
		System.out.println(s.startsWith("Boa"));//colocando o valor da string anterior da falso
		System.out.println(s.length()); //saber a quantidade de caracteres
		System.out.println("\n\n\n");
		System.out.println(s.equals("bom dia")); // verificar a igualdade, leva em consideração as strings maiusculas e minusculas
		System.out.println(s.equalsIgnoreCase("Bom dia")); // verifica igualdae sem levar em consideração as strings maiusculas e minusculas
		
		
		var nome = "humberto";
		var sobrenome= "itiro";
		var idade =17;
		var salario = 100.50;
		System.out.println("nome: " + nome + "\nsobrenome: " + sobrenome + "\nidade: "+idade + "\nsalario: " + salario + "\n\n"); 
		
		System.out.printf("O senhor %s %s, tem %s anos, ganha R$%.2f", nome, sobrenome, idade, salario); // melhor maneira de formatação
		//para a formatação de real, colocasse R$2.f;
		System.out.println("\n");
		System.out.println("Um belo dia de trabalho".contains("dia")); // verifica se  a string contem a frase dia
		System.out.println("Um belo dia de trabalho".indexOf("dia"));// indice de dia
		System.out.println("Um belo dia de trabalho".substring(7)); // demacar as strings
		System.out.println("Um belo dia de trabalho".substring(3, 11)); //
		
		}
	}
