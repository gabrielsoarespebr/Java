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

        System.out.println(p); //Forma valida porque a classe toString foi sobreposta em Produto, e o println reconhece seu parametro como string

        int opcao;
        do {
            System.out.println();
            System.out.println("Tecle 0 para sair, 1 para adicionar ou 2 para remover o produto do estoque.");
            opcao = scan.nextInt();
            if (opcao == 1) {
                System.out.print("Insira a quantidade para ADICIONAR: ");
                p.Adicionar(scan.nextInt());
                System.out.println(p);
            }
            if (opcao == 2) {
                System.out.print("Insira a quantidade para REMOVER: ");
                p.Remover(scan.nextInt());
                System.out.println(p);
            }
        } while (opcao != 0);

        scan.close();
    }
}
