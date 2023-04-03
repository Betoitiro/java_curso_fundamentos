package aulas_fundamentos;

import java.util.Scanner;

public class console {
	public static void main(String[] args) {
		
		System.out.print("bom"); //apenas o comando print, sem o ln, realizara todos os outros comandos na mesma linha
		System.out.print("dia");
		
		System.out.print("\n\n"); // quebra de linha
		
		System.out.println("galera");
		System.out.println("bom dia");//com o ln havera uma quebra de linha automatica
		
		System.out.printf("numeros do dia: %s %s %s %s", 1, 4,6,7); //formatação
		//o printf n tem quebra de linha, se quiser quebrar  a linha tem que colcoar o \n
		
		System.out.printf("o salario dele é de %.1f%n", 1500.7620);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.",
				nome,sobrenome,idade);
		
		entrada.close();
		
		
		
		
		}
		
	}


