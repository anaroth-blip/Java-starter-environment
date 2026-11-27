
public class Desenvolvedor extends Funcionario {

    // Atributo
    private String linguagemPrincipal;

    // Construtor
    public Desenvolvedor(String nome, double salario, String linguagemPrincipal) {
        super(nome, salario);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    // Getter
    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    // Setter
    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }

    // Sobrescrita do método
    @Override
    public void mostrarFuncionario() {
        super.mostrarFuncionario();
        System.out.println("Linguagem principal: " + linguagemPrincipal);
    }
}
