import java.util.Scanner;
// Verificar se o usuario passou de ano ou ficou de recuperação
public class Condicionais {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma nota ( 0 a 10 )");
        double nota = sc.nextDouble();
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
            
        }else {
            System.out.println("Reprovado");
        }
        sc.close();
    }
}


