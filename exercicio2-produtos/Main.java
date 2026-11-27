
public class Main {

    public static void main(String[] args) {

        // Cadastrando um notebook
        Notebook notebook = new Notebook(
            "Notebook Dell",
            3500.00,
            8
        );

        // Alterando a memória RAM
        notebook.setMemoriaRAM(16);

        // Exibindo os dados
        notebook.mostrarProduto();
    }
}
