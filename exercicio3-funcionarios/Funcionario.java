
public class Funcionario {

    // Atributos privados
    private String nome;
    private double salario;

    // Construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para mostrar os dados
    public void mostrarFuncionario() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
    }
}
