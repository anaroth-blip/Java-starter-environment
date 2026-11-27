
public class Aluno extends Pessoa {

    // Atributo
    private String curso;

    // Construtor
    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    // Getter
    public String getCurso() {
        return curso;
    }

    // Setter
    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Sobrescrita do método
    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Curso: " + curso);
    }
}
