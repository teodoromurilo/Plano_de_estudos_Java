import java.util.Scanner;

public class laco_repeticoes {
    static void main(String[] args) {
        // FOR , WHILE  BREAK E CONTINUE
        // 1- Imprimir os numeros de 0 a 100 , 2- Contagem regressiva de 100 a 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para mostrar a tabuada ");
        double numero = sc.nextDouble();
        System.out.println("--- Tabuada do " + numero + "---");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "x" + i + " = " + (numero * i));
        }
        System.out.println("--- Contagem regressiva --- ");
        int contador = 100;
        while (contador >= 0) {
            System.out.println(contador + " ... ");
            contador--;
        }
        System.out.println("Lançamento concluido ");
        sc.close();

        System.out.println("--- Numeros pares de 0 a 100 ");
        for (int i = 2; i <= 100; i+= 2) {
            System.out.println(i);
        }
    }
}