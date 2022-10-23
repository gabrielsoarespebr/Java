package udemy.trianguloheron.trianguloheroncompoo;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Programa que calcula a area de dois triangulos e informa o maior.");
        System.out.println();
        System.out.println("Formula de Heron:");
        System.out.println("Area = \\/p(p-a)(p-b)(p-c)'");
        System.out.println();
        System.out.println("p = (a+b+c)/2");

        System.out.println();
        System.out.println("Triangulo 1");
        System.out.println("Insira o tamanho do lado A: (Exemplo: 7,5)");
        x.a = scan.nextDouble();
        System.out.println("Insira o tamanho do lado B:");
        x.b = scan.nextDouble();
        System.out.println("Insira o tamanho do lado C:");
        x.c = scan.nextDouble();

        System.out.println();
        System.out.println("Triangulo 2");
        System.out.println("Insira o tamanho do lado A: (Exemplo: 7,5)");
        y.a = scan.nextDouble();
        System.out.println("Insira o tamanho do lado B:");
        y.b = scan.nextDouble();
        System.out.println("Insira o tamanho do lado C:");
        y.c = scan.nextDouble();

        System.out.println();
        System.out.println("Area do Triangulo 1: " + x.Area());
        System.out.println("Area do Triangulo 2: " + y.Area());
        if (x.Area() == y.Area()) {
            System.out.println("Os triangulos tem areas iguais");
        } else {
            if (x.Area() > y.Area())
                System.out.println("O Triangulo 1 tem a area maior.");
            else
                System.out.println("O Triangulo 2 tem a area maior.");
        }

        scan.close();
    }

}
