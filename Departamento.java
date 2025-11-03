public class Departamento {
    private String nomeDepartamento;
    // Composição: O Departamento TEM UM objeto Funcionario (o gerente)
    private Funcionario gerente;

    public Departamento(String nomeDepartamento, Funcionario gerente) {
        this.nomeDepartamento = nomeDepartamento;
        this.gerente = gerente;
    }

    public void exibirDetalhes() {
        System.out.println("\n--- DETALHES DO DEPARTAMENTO ---");
        System.out.println("Departamento: " + nomeDepartamento);
        System.out.print("Gerente: ");
        gerente.exibirInformacoes(); // Chama o método do objeto Funcionario
        System.out.println("--------------------------------");
    }
}
