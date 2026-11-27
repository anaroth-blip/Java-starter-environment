
public class Produto {

    // Atributos protected
    protected String nome;
    protected double preco;

    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para mostrar o produto
    public void mostrarProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}
