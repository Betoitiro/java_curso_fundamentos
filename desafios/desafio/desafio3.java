package desafio;

import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        //desafio calculadora
        Scanner entrada = new Scanner(System.in);

        System.out.println("informe um numero: ");
        double n1 = entrada.nextDouble();

        System.out.println("informe outro numero: ");
        double n2 = entrada.nextDouble();

        System.out.println("informe a operação: ");
        String op = entrada.next();

        double res = "+".equals(op) ? n1 + n2 :0;
        res = "-".equals(op) ? n1 - n2 : res;
        res = "*".equals(op) ? n1 * n2 : res;
        res = "/".equals(op) ? n1 / n2 : res;
        res = "%".equals(op) ? n1 % n2 : res;

        System.out.printf(" %.2f %s %.2f = %.2f",
        n1, op, n2, res);
    }
}
