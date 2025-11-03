public class Analista extends Funcionario {
    private String especialidade;

    public Analista(String nome, double salario, String especialidade) {
        // Usa 'super' para chamar o construtor da classe Funcionario
        super(nome, salario);
        this.especialidade = especialidade;
    }

    public void analisarDados() {
        System.out.println(getNome() + " está preparando relatórios de " + especialidade + ".");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cargo: Analista, Especialidade: " + especialidade);
    }
}
