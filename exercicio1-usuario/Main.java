
public class Main {
    
    public static void main(String[] args) {

        // Criando um administrador
        Administrador admin = new Administrador(
            "Ana Julia",
            "ana@email.com",
            "Básico"
        );

        // Alterando o nível de acesso
        admin.setNivelAcesso("Total");

        // Exibindo as informações
        admin.exibirDados();
    }
}
