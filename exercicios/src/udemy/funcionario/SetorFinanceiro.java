package udemy.funcionario;

import java.util.Scanner;

public class SetorFinanceiro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.println("--- SETOR FINANCEIRO ---");
        System.out.print("Nome do funcionario: ");
        f.nome = scan.next();
        System.out.print("Salario bruto: R$");
        f.salario = scan.nextInt();
        System.out.print("Impostos: R$");
        f.impostos = scan.nextInt();

        f.Status();

        System.out.println();
        System.out.println("Digite 1 para aumentar o salario do funcionario ou 0 para sair.");
        int opcao = scan.nextInt();

        if (opcao == 1) {
            System.out.println("Porcentagem do aumento: ");
            double porcentagem = scan.nextDouble();
            f.AumentoSalarial(porcentagem);
            f.Status();
        }

        scan.close();
    }
}
