package tipos_primitivos;

public class tipos_primitvos {
		public static void main(String[] args) {
		//informações de funcionario
			
			//tipos primitivos
			byte ade = 23;
			short  ndv = 542;
			int id = 56789;
			long pac = 3_134_845_223L;
			//quando passa da capacidade do int tem que colocar um L no final
			
			//tipos numericos reais
			float sal = 11_445.44F;
			//para escrever um literal float, tem que colocar um f no final, para n entrar como double
			double vac = 2_991_797_103.01;
					
			// TIPO BOOLEANO		
			boolean edf = false;
			//tipo caracter
			char status = 'A';
			
			//diasd da empresa
			System.out.println("tota de " + ade *365 + " dias");
			
			//nummeros de voos
			System.out.println("numero total de viagens (ida e volta = 1 viagem): " + ndv/2);
			
			// pontos por real
			
			System.out.println("dots por venda efetuada " +pac / vac);
			System.out.println("o  id " + id + " ganha -> " + sal + "ds salario bruto");
			System.out.println("ele esta de ferias? " + edf);
			System.out.println("o seu status na empresa: " + status);
			
			
			
			
		}

}
