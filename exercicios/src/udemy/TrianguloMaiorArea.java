package udemy;
import java.util.Scanner;

public class TrianguloMaiorArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdTriangulos = 2;
        double[] ladoTriangulo = new double[3];
        double p;
        double[] Area = new double[qtdTriangulos];

        System.out.println("Programa que calcula a area de dois triangulos e informa o maior.");
        System.out.println();
        System.out.println("Formula de Heron:");
        System.out.println("Area = \\/p(p-a)(p-b)(p-c)'");
        System.out.println();
        System.out.println("p = (a+b+c)/2");

        for (int i = 0; i < qtdTriangulos; i++) {
            System.out.println();
            System.out.println("Triangulo " + (i + 1));
            System.out.println("Insira o tamanho do lado A: (Exemplo: 7,5)");
            ladoTriangulo[0] = scan.nextDouble();
            System.out.println("Insira o tamanho do lado B:");
            ladoTriangulo[1] = scan.nextDouble();
            System.out.println("Insira o tamanho do lado C:");
            ladoTriangulo[2] = scan.nextDouble();
            p = (ladoTriangulo[0] + ladoTriangulo[1] + ladoTriangulo[2]) / 2;
            Area[i] = Math.sqrt((p * (p - ladoTriangulo[0]) * (p - ladoTriangulo[1]) * (p - ladoTriangulo[2])));
        }

        System.out.println();
        System.out.println("Area do Triangulo 1: " + Area[0]);
        System.out.println("Area do Triangulo 2: " + Area[1]);
        if (Area[0] == Area[1]) {
            System.out.println("Os triangulos tem areas iguais");
        } else {
            if (Area[0] > Area[1])
                System.out.println("O Triangulo 1 tem a area maior.");
            else
                System.out.println("O Triangulo 2 tem a area maior.");
        }

        scan.close();
    }
}
