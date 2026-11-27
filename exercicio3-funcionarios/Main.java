
public class Main {

    public static void main(String[] args) {

        // Cadastrando um desenvolvedor
        Desenvolvedor desenvolvedor = new Desenvolvedor(
            "Ana Julia",
            3000.00,
            "Java"
        );

        // Alterando o salário
        desenvolvedor.setSalario(4500.00);

        // Exibindo os dados
        desenvolvedor.mostrarFuncionario();
    }
}
