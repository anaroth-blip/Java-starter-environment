
public class Administrador extends Usuario {

    // Atributo privado
    private String nivelAcesso;

    // Construtor
    public Administrador(String nome, String email, String nivelAcesso) {
        super(nome, email);
        this.nivelAcesso = nivelAcesso;
    }

    // Getter
    public String getNivelAcesso() {
        return nivelAcesso;
    }

    // Setter
    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    // Sobrescrita do método
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Nível de acesso: " + nivelAcesso);
    }
}
