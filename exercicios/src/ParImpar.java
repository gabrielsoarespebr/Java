import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdTotal;
        System.out.println("Digite a quantidade de numeros a ser analisada: ");
        qtdTotal = scan.nextInt();

        int numero;
        int qtdPares = 0;
        int qtdImpares = 0;
        int i=0;
        do{
            System.out.println("Insira um numero: ");
            numero = scan.nextInt();
            if ((numero%2) == 0){
                qtdPares++;
            } else qtdImpares++;
            i++;
        } while(i<qtdTotal);
        System.out.println("Quantidade de pares: " + qtdPares);
        System.out.println("Quantidade de impares: " + qtdImpares);
    }
}
