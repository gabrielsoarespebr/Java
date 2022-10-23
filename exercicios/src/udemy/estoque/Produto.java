package udemy.estoque;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public String Status() {
        return "Informacoes do produto: " + nome + " custa R$" + preco + ", e as " + quantidade
                + " unidades representam um valor total de R$" + ValorTotalDeEstoque() + " no estoque.";
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
