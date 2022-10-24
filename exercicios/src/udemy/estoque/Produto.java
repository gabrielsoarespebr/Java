package udemy.estoque;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String n, double p, int q) {
        nome = n;
        preco = p;
        quantidade = q;
    }

    public String toString() { // Sobrescrevendo classe toString
        return "Informacoes do produto: "
                + nome
                + " custa R$"
                + String.format("%.2f", preco) // String.format para colocar duas casas decimais
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
