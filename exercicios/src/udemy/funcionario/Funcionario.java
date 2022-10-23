package udemy.funcionario;

public class Funcionario {
    public String nome;
    public double salario;
    public double impostos;

    public void Status() {
        System.out.println("O funcionario "
                + nome
                + " tem o salario liquido de R$"
                + String.format("%.2f", (salario - impostos)));
    }

    public void AumentoSalarial(double porcentagem) {
        salario += (porcentagem / 100) * (salario - impostos);

    }

}
