package udemy.estoque;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public String toString() { // Sobrescrevendo classe toString
        return "Informacoes do produto: "
                + nome
                + " custa R$"
                + String.format("%.2f", preco) //String.format para colocar duas casas decimais
                + ", e as "
                + quantidade
                + " unidades representam um valor total de R$"
                + String.format("%.2f", ValorTotalDeEstoque())
                + " no estoque.";
    }

    public double ValorTotalDeEstoque() {
        return quantidade * preco;
    }

    public void Adicionar(int quantidade) {
        this.quantidade += quantidade;
    }

    public void Remover(int quantidade) {
        this.quantidade -= quantidade;
    }

}
