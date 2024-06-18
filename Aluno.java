// Subclasse para alunos normais
public class Aluno extends MembroAcademia {
    private boolean mensalidadePaga;

    public Aluno(String nome, int idade, String endereco) {
        super(nome, idade, endereco);
        this.mensalidadePaga = false;
    }

    public boolean isMensalidadePaga() {
        return mensalidadePaga;
    }

    public void setMensalidadePaga(boolean mensalidadePaga) {
        this.mensalidadePaga = mensalidadePaga;
    }

    @Override
    public double calcularMensalidade() {
        return mensalidadePaga ? 100.0 : 0.0; // Exemplo simples de cálculo de mensalidade
    }
}

