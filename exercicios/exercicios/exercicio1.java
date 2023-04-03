package exercicios;

import java.util.Scanner;


public class exercicio1 {
        public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in) ;
           System.out.println("Digite um numero inteiro");
           String num = scanner.nextLine();
           if (num % 2 ==0){
            System.out.println(num + " é um numero par.");
           }else{
            System.out.println(num + " é um numero impar");
           }
        }
    }