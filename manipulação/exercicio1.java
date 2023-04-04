package manipulação;

import java.util.Scanner;


public class exercicio1 {
      public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in) ;
           System.out.println("Digite um numero inteiro");
           int num = scanner.nextInt();
           if (num % 2 ==0){
            System.out.println(num + " é um numero par.");
           }else{
            System.out.println(num + " é um numero impar");
           }
        }
    }