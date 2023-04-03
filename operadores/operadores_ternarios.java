package operadores;

public class operadores_ternarios {
    public static void main(String[] args) {
        
        double media = 5.0;
        String resultado = media >= 7.0 ? "aprovado": "reprovado";
        //operadores ternarios possuem dois simbulos, a ? que separa a expressão dos valores que serão atribuidos
        //e os : que separa o valor caso seja verdadeira ou falsa

        System.out.println("o aluno esta " + resultado);

        double media1 = 7.7;
        String resultado1 = media1 >= 7.0 ? "aprovado": "reprovado";

        System.out.println("O aluno esta " +resultado1);

        System.out.println("Resultado da recuperação:");
        double resultadorec = 5.0;
        String resultof =resultadorec >= 5.5 ? "recuperação" : "reprovado";
        System.out.println("o aluno ira direto para " + resultof);


    }
}
