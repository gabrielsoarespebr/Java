public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Metodos especiais
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
            int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private float getAltura() {
        return altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    private float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        this.getsetCategoria();
    }

    private String getsetCategoria() {
        if (this.peso < 52.2 || this.peso > 120.2) {
            return "invalido";
        } else if (this.peso <= 70.3) {
            return "leve";
        } else if (this.peso <= 83.9) {
            return "médio";
        } else
            return "pesado";
    }

    private int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }

    // Metodos abstratos
    public void apresentar() {
        System.out.println("");
        System.out.println("CHEGOU A HORA!");
        System.out.println("Na categoria peso " + getsetCategoria());
        System.out.println("Diretamente de " + getNacionalidade());
        System.out.println("Com " + getIdade() + " anos, " + getAltura() + "m e " + getPeso() + "kg.");
        System.out.println(getVitorias() + " vitórias, " + getDerrotas() + " derrotas e " + getEmpates() + " empates");
        System.out.println("Apresentamos o lutador " + getNome() + "!");
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }

}
