package manipulação;

public class função_ponto {
		public static void main(String[] args) {
			
			String s =  "bom dia X";
			
			s = s.replace("X", "senhora!"); //para modicicar uma palavra dentro da string

			s = s.toUpperCase(); //para deixar a string em maiuscula
			
			s = s.concat(", como foi o seu dia?"); //comando para concatenar as string
			
			System.out.println(s);
			
			//outras funcionalidades
			
			
			System.out.println("Humberto".toUpperCase());
			
			String x = "Beto".toUpperCase();
			System.out.println(x);
			
			String y = "Bom dia X".replace("X", "Humberto")
					.toLowerCase().concat(", como foi seu dia?");
			
			System.out.println(y);
			
			
			//os tipos primitivos, não possuem as funcionalidades do ponto!!
			//notação ponto, serve para todo o resto das operações do java, menos dos tipos primitivos!
			 		
		}
}	
