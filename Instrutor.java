// Subclasse para instrutores
public class Instrutor extends MembroAcademia {
    private String especialidade;

    public Instrutor(String nome, int idade, String endereco, String especialidade) {
        super(nome, idade, endereco);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public double calcularMensalidade() {
        return 200.0; // Exemplo simples de cálculo de mensalidade para instrutores
    }
}
