package matematica;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            int numero;
            int contador;

            System.out.println("Programa de tabuada.");
            System.out.println("Insira o numero:");
            numero = scan.nextInt();

            for(contador=1;contador<11;contador++){
                System.out.println(numero + " x " + contador + " = " + (numero*contador));
            }
        }
    }   
}
