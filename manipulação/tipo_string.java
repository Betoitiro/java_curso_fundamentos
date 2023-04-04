package manipulação;

import java.util.Scanner;

public class tipo_string {
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2"); //true
		
		String s = new String ("2"); 
		System.out.println("2" == s);//false
		System.out.println("2".equals(s)); //true
		//.equals serve para comprar o conteudo
		
		Scanner entrada = new Scanner (System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim());//sem o equals dara false
		System.out.println("2".equals(s2.trim()));//.trim serve para tirar os espaços
		//ponto chave da aula equals, que compara o produto, e verificara a risca o tipo da variavel
		entrada.close();
	}
}
