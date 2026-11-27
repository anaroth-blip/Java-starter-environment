
public class Main {

    public static void main(String[] args) {

        // Cadastrando um aluno
        Aluno aluno = new Aluno(
            "Ana Julia",
            17,
            "Desenvolvimento de Sistemas"
        );

        // Alterando a idade
        aluno.setIdade(17);

        // Apresentando os dados
        aluno.apresentar();
    }
}
