package exercicios_curso_Java.java_curso;

import javax.swing.JOptionPane;

public class string_numero {
	public static void main(String[] args) {
		//conversão string para numero
		
		String valor = JOptionPane.showInputDialog( //o comando usado é para consultar o numero, sem ser pelo console
				"Digite o primeiro numero: ");
		
		String valor2 = JOptionPane.showInputDialog(
				"Digite o primeiro numero: ");
	
		System.out.println(valor + valor2);//o numero apresetado no print sera 56 devido a serem duas strings
		
		//convertendo os valores em number
		double numero1 = Double.parseDouble(valor); 
		double numero2 = Double.parseDouble(valor2);
		
		//operações com os valores
		double soma = numero1 + numero2;
		System.out.println("a soma dos valores é " + soma);
		System.out.println("a media dos valores é " + soma/2);
		
	}
}
