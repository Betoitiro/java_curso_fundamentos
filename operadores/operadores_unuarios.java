package operadores;

public class operadores_unuarios {
    
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a++; //a = a +1
        a--; // a = a -1
        
        b++; // b = b + 1
        b--;

        System.out.println(a);
        System.out.println(b);//teve um encremento
        System.out.println("mine desafio...");
        System.out.println(++a == b--);
        System.out.println(a == b);//nesse caso sera false, devido a linnha de precedencia!
        System.out.println(a);
        System.out.println(b);

    }
}
