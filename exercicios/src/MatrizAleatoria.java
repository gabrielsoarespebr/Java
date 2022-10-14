import java.util.Random;;

public class MatrizAleatoria {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        // matriz 4x4
        int qtdLinhas = 4;
        int qtdColunas = 4;

        int[][] matriz = new int[qtdLinhas][qtdColunas];

        for (int contaLinha = 0; contaLinha < qtdLinhas; contaLinha++) {
            for (int contaColuna = 0; contaColuna < qtdColunas; contaColuna++) {
                matriz[contaLinha][contaColuna] = aleatorio.nextInt(9); // numero entre 0 e 9
            }
        }

        for(int[] vetorLinha : matriz){
            for(int elementodaColuna : vetorLinha){
                System.out.print(elementodaColuna + " ");
            }
            System.out.println();
        }

    }
}
