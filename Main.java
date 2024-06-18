public class Main {
    public static void main(String[] args) {
        CadastroAcademia academia = new CadastroAcademiaImpl();

        Aluno aluno1 = new Aluno("Jadson", 25, "Rua JV");
        aluno1.setMensalidadePaga(true);
        academia.adicionarMembro(aluno1);

        Instrutor instrutor1 = new Instrutor("Gabi", 32, "Rua H", "Musculação");
        academia.adicionarMembro(instrutor1);

        // Listando membros
        List<MembroAcademia> membros = academia.listarMembros();
        for (MembroAcademia membro : membros) {
            System.out.println("Nome: " + membro.getNome() + ", Tipo: " + membro.getClass().getSimpleName() +
                    ", Mensalidade: R$" + membro.calcularMensalidade());
        }
    }
}
