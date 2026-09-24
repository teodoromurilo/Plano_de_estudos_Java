import java.util.Scanner;

public class Entrada_de_dados {
    static void main(String[] args) {
       // **Desafio:** Criar um programa interativo que pergunte ao usuário:
        //1. Nome completo
        //2. Idade
        //3. Cidade onde mora
        //E apresente uma mensagem personalizada com essas informações.



        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome ");
        String nome = sc.nextLine();

        System.out.println("Qual é a sua idade ? ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Qual é a sua cidade de origem ?");
        String cidade = sc.nextLine();

        System.out.println("Óla , meu nome é  "+ nome+ " eu tenho "+ idade+ " anos e sou natural de " + cidade);
    }
}
