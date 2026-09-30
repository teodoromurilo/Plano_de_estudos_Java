public class PraticaMetodos {
    public static int somar(int a, int b) {
        return a + b;
    }
    public static double CalcularMedia ( double n1 , double n2, double n3){
        return (n1 + n2 + n3 ) /3.0 ;
    }

    public static boolean isPar(int numero){
        return numero % 2 == 0 ;
    }
    public static void exibirmensagem(String nome){
        System.out.println("Bem vindo(a) " +nome + " !");
    }

    static void main(String[] args) {
        exibirmensagem("Desenvolvedor Java ");
        System.out.println("Soma 15 + 25 = "+somar(15 , + 25 ));
        System.out.println("Media 7.0 , 8.5 , 9.0 " + CalcularMedia(7.0 , 8.5 , 9.0 ));
        System.out.println("O numero 10 é par ? " + isPar(10));
    }
}
