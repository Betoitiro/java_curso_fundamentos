public class desafio_operadores_logicos {
    public static void main(String[] args) {
        
        //trabalho na terça (v ou f)
        // trabalho na quinta (v ou f)

        boolean trabalho = false;
        boolean trabalho2 = false;

        boolean comproutv50 =  trabalho && trabalho2; //operador e
        boolean comprouTV32 = trabalho ^trabalho2; //operador ou exclusivo
        boolean comprouSorvete = trabalho || trabalho2;//operador ou
        boolean maissaudavel = !comprouSorvete; //operador unario



        System.out.println("comprou tv 50\"?" + comproutv50);
        System.out.println("comprou tv de 32\"?" + comprouTV32);
        System.out.println("comprou tv de 32\"sorvete?" + comprouSorvete);


        System.out.println("mais saudavel?" + !comprouSorvete);
       


    }
}
