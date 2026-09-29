import java.util.Scanner;
// Verificar se o numero é positivo , negativo ou 0
public class Condicionais_Numeros_positivos {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero aleatorio ");
        double numero = sc.nextDouble();
        if (numero > 0){
            System.out.println(numero + " Positivo ");
        } else if (numero < 0) {
            System.out.println(numero + " Negativo ");

        }else{
            System.out.println(numero + " zero ");
        }
        sc.close();
    }
}
