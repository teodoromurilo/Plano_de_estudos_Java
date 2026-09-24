public class CalculandoSalario {
    static void main(String[] args) {
        //**Desafio:** Criar um programa que armazene um salário atual e calcule o valor com um aumento de 10%, exibindo o salário original, o aumento e o novo valor.

        double Salario_atual = 3000;
        double aumento = 0.10 ;
        double salario_com_aumento = Salario_atual * aumento ;
        double salario_Final = Salario_atual + salario_com_aumento;

        System.out.println("O valor do Salario atual é de "+ Salario_atual);
        System.out.println("O valor do aumento foi de " + salario_com_aumento);
        System.out.println("O valor com reajuste ficou em "+ salario_Final);
    }
}
