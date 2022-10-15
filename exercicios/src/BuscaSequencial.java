import java.util.Scanner;

public class BuscaSequencial {

    public static void main(String[] args) {

        try (Scanner recebe = new Scanner(System.in)) {
            System.out.print("Pensei em 10 numeros inteiros. Adivinhe um deles: ");
            int numero = recebe.nextInt();

            int[] elementos = { 64, 137, -16, 43, 67, 81, -90, 212, 10, 75 };
            int tamanho = elementos.length;

            System.out.println(meumetodo(numero, elementos, tamanho));
        }
    }

    public static String meumetodo(int number, int[] array, int size) {
        int temAlgum = 0;
        String retorno = "gabriel";
        for (int i = 0; i < size; i++) {
            if (number == array[i]) {
                temAlgum++;
                retorno = ("Achei " + number + " na posicao " + i);
            }
        }
        if (temAlgum == 0) {
            retorno = ("Numero " + number + " nao encontrado!");
        }
        return retorno;
    }
}
