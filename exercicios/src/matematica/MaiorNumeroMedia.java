package matematica;
import java.util.Scanner;

public class MaiorNumeroMedia{
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            int numero;
            int contador=0;
            int soma=0;
            int maior=0;

            do{
                System.out.println("Insira um numero: ");
                numero = scan.nextInt();
                soma += numero;
                if (numero > maior) maior = numero;
                contador++;
            } while (contador<5);
            System.out.println("Maior: " + maior);
            System.out.println("Media: " + (soma/contador));
        }
    }
}