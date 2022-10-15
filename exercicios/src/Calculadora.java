import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            CalculadoraSoma soma = new CalculadoraSoma();
            CalculadoraSubtracao subtracao = new CalculadoraSubtracao();
            CalculadoraMultiplicacao multiplicacao = new CalculadoraMultiplicacao();
            CalculadoraDivisao divisao = new CalculadoraDivisao();

            System.out.println("+ - * / CALCULADORA + - * /");
            System.out.print("Escolha a operacao: ");
            String operacao = input.next();
            System.out.print("Insira o primeiro numero: ");
            int num1 = input.nextInt();
            System.out.print("Insira o segundo numero: ");
            int num2 = input.nextInt();

            int resultado = 0;

            switch (operacao) {
                case "+":
                    resultado = soma.main(num1, num2);
                    System.out.print("A soma e: ");
                    break;

                case "-":
                    resultado = subtracao.main(num1, num2);
                    System.out.print("A subtracao e: ");
                    break;

                case "*":
                    resultado = multiplicacao.main(num1, num2);
                    System.out.print("A multiplicacao e: ");
                    break;

                case "/":
                    resultado = divisao.main(num1, num2);
                    System.out.print("A divisao e: ");
                    break;

                default:
                    System.out.println("Operacao invalida.");
                    break;
            }

            System.out.print(resultado);
        }
    }
}