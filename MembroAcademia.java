// Classe abstrata para representar um membro da academia
public abstract class MembroAcademia {
    private String nome;
    private int idade;
    private String endereco;

    // Construtor
    public MembroAcademia(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Método abstrato para calcular a mensalidade
    public abstract double calcularMensalidade();
}
