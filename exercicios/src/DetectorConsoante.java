import java.util.Scanner;

public class DetectorConsoante {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int tamanhoString = 6;
            String[] letras = new String[tamanhoString];

            System.out.println("Programa detector de consoantes.");

            for (int contador = 0; contador < tamanhoString; contador++) {
                System.out.println("Insira a letra:");
                String entrada = scan.next();
                if (
                    entrada.equalsIgnoreCase("a") |
                    entrada.equalsIgnoreCase("e") |
                    entrada.equalsIgnoreCase("i") |
                    entrada.equalsIgnoreCase("o") |
                    entrada.equalsIgnoreCase("u")) letras[contador] = entrada;
            }

            System.out.print("Consoantes: ");
            for (String consoante : letras) {
                if(consoante != null) System.out.print(consoante + " ");
            }
        }
    }
}