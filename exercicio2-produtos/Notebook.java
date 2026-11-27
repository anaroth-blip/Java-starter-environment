
public class Notebook extends Produto {

    // Atributo privado
    private int memoriaRAM;

    // Construtor
    public Notebook(String nome, double preco, int memoriaRAM) {
        super(nome, preco);
        this.memoriaRAM = memoriaRAM;
    }

    // Getter
    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    // Setter
    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    // Sobrescrita do método
    @Override
    public void mostrarProduto() {
        super.mostrarProduto();
        System.out.println("Memória RAM: " + memoriaRAM + " GB");
    }
}
