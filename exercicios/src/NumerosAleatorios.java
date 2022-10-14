import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args){
        Random aleatorio = new Random();

        int[] lista = new int[20];

        for(int contador=0;contador<(lista.length);contador++){
            lista[contador] = aleatorio.nextInt(100); //numeros aleatorios de 0 a 100
        }

        System.out.print("Numeros aleatorios: ");
        for(int numero : lista){
            System.out.print(numero + " ");
        }
    }
}
