// Interface para gerenciar o cadastro de membros
public interface CadastroAcademia<List> {
    void adicionarMembro(MembroAcademia membro);
    void removerMembro(String nome);
    MembroAcademia buscarMembro(String nome);
    List<MembroAcademia> listarMembros();
}

// Implementação básica da interface CadastroAcademia
public class CadastroAcademiaImpl implements CadastroAcademia {
    private List<MembroAcademia> membros;

    public CadastroAcademiaImpl() {
        this.membros = new ArrayList<>();
    }

    @Override
    public void adicionarMembro(MembroAcademia membro) {
        membros.add(membro);
    }

    @Override
    public void removerMembro(String nome) {
        membros.removeIf(m -> m.getNome().equals(nome));
    }

    @Override
    public MembroAcademia buscarMembro(String nome) {
        for (MembroAcademia membro : membros) {
            if (membro.getNome().equals(nome)) {
                return membro;
            }
        }
        return null;
    }

    @Override
    public List<MembroAcademia> listarMembros() {
        return membros;
    }
}