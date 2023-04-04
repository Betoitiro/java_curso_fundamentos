
import java.util.Scanner;


public class desafio1 {
	public static void main(String[] args) {
		System.out.println("sistema de media salarial: ");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digite seu salario: ");
		String s1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o seu segundo salario: ");
		String s2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("digite o seu terceiro salario: ");
		String s3 = entrada.nextLine().replace(",", ".");
		
		//o replace usado serve para substituir a virgula por .
		
		
		double salario1 = Double.parseDouble(s1);
		double salario2 = Double.parseDouble(s2);
		double salario3 = Double.parseDouble(s3);
		
		double soma = salario1 + salario2 + salario3;
		System.out.println("o valor total recebido dos salarios corresponde a: " + soma);
		System.out.println("e a media salarial do usuario foi de " + soma/3);
		
		entrada.close();
		}

}
