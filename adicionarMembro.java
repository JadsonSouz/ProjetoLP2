// Adicionando regra de negócio no método adicionarMembro da classe CadastroAcademiaImpl
@Override
public void adicionarMembro(MembroAcademia membro) {
    if (membro instanceof Aluno) {
        Aluno aluno = (Aluno) membro;
        if (aluno.isMensalidadePaga()) {
            membros.add(aluno);
        } else {
            System.out.println("Não é possível adicionar aluno. Mensalidade não paga.");
        }
    } else {
        membros.add(membro);
    }
}
