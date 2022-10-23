package udemy.estoque;

import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Produto p = new Produto();

        System.out.println();
        System.out.println("--- ESTOQUE ---");
        System.out.print("Nome: ");
        p.nome = scan.next();
        System.out.print("Preco da unidade: R$");
        p.preco = scan.nextDouble();
        System.out.print("Quantidade no estoque: ");
        p.quantidade = scan.nextInt();

        System.out.println(p.Status());

        int opcao;
        do {
            System.out.println();
            System.out.println("Tecle 0 para sair, 1 para adicionar ou 2 para remover o produto do estoque.");
            opcao = scan.nextInt();
            if (opcao == 1) {
                System.out.print("Insira a quantidade para ADICIONAR: ");
                p.Adicionar(scan.nextInt());
                System.out.println(p.Status());
            }
            if (opcao == 2) {
                System.out.print("Insira a quantidade para REMOVER: ");
                p.Remover(scan.nextInt());
                System.out.println(p.Status());
            }
        } while (opcao != 0);

        scan.close();
    }
}
