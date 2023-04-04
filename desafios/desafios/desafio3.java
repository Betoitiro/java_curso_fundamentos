package desafios;

import java.util.Scanner;
public class desafio3 {
	public static void main(String[] args) {
		//desafio calculadora
		
		Scanner entrada = new Scanner(System.in);
		
		//primeiro pede ao usuario que informe dois numeros
		System.out.println("informe um numero: ");
		double n1 = entrada.nextDouble();
		
		System.out.println("informe um numero: ");
		double n2 = entrada.nextDouble();
		
		//pedimos para que informa a operação
		System.out.println("informa a operação");
		String op = entrada.next();
		
		//logica do programa de como funcionara as operações
		double res = "+".equals(op) ? n1+ n2 :0;
		res = "-".equals(op) ? n1 - n2 : res;
		res = "*".equals(op) ? n1 * n2 : res;
		res = "/".equals(op) ? n1 / n2 : res;
		res = "%".equals(op) ? n1 % n2 : res;
		
		
		
		System.out.printf("%.2f %s %.2f = %2.f", 
				n1, op, n2, res);
		
		entrada.close();
	}
}
