import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numero;

            System.out.println("Programa de fatorial.");
            System.out.println("Insira o numero:");
            numero = scan.nextInt();

            int produto = 1;
            for(int contador=1;contador<=numero;contador++){
                produto *= contador;
            }

            System.out.println("Fatorial: " + produto);
        }
    }
}
