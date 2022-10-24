package dio.projetopoo;

import java.util.Scanner;

public class Bootcamp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digital Innovation One");
        System.out.print("Insira seu nome: ");
        String nome = scan.next();
        System.out.print("Insira sua idade: ");
        int idade = scan.nextInt();
        Dev dev = new Dev(nome, idade);

        int opcao;
        String titulo = "";
        String descricao = "";
        int cargaHoraria = 0;
        do {
            System.out.print(
                    "Escolha seu curso: \n1) Desenvolvimento Back-End\t2) Desenvolvimento Front-End\t3) Ciencia de Dados");
            opcao = scan.nextInt();
        } while (opcao < 1 || opcao > 3);
        switch (opcao) {
            case 1:
                titulo = "Desenvolvimento Back-End";
                descricao = "Torne-se um programador back-end agora mesmo!";
                cargaHoraria = 120;
                break;
            case 2:
                titulo = "Desenvolvimento Front-End";
                descricao = "Torne-se um programador front-end agora mesmo!";
                cargaHoraria = 95;
                break;
            case 3:
                titulo = "Ciencia de Dados";
                descricao = "Torne-se um cientista de dados agora mesmo!";
                cargaHoraria = 142;
                break;
        }
        Curso curso = new Curso(titulo, descricao, cargaHoraria);

        System.out.println(dev);
        System.out.println(curso);



        scan.close();
    }
}
