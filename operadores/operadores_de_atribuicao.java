package operadores;

public class operadores_de_atribuicao {
    
    public static void main(String[] args) {
        
        int y = 3;
        int z = y;
        int x = y + z;

        //x = x +z;
        x +=z; //  equivale a x= x + z
        x -= z; //--- x = x - z
        x *= z ; //--- x = x *z
        x /= y; // --- x = x / y

        System.out.println(x); //numero par 
        x %=2; // --- x = x % 2; 0 ou 1

        System.out.println(x);
    }
}
