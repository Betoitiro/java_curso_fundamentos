package operadores;

public class operadores_Relacionais {

    public static void main(String[] args) {
        
        //metodo não muito utilizado, pois deixa o codio confuso
        int a = 97;
        int b = 'a';

        System.out.println(a == b);

        //System.out.println('\u0061'); //o valor corresponde a 97 no hexa.

        //outros operadores relacionais
        System.out.println(3 > 4);
        System.out.println(3 < 4);
        System.out.println(5<9);
        System.out.println(30 <=70);
        System.out.println(50 !=60);

        //como usar os operadores relacionais no dia a dia
        double nota = 7.3;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;

        boolean temDesconto = bomComportamento && passouPorMedia;

        System.out.println("tem desconto? "+ temDesconto);


    }
    
}
