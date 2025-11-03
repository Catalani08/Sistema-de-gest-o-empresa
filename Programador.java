public class Programador extends Funcionario {
    private String linguagem;

    public Programador(String nome, double salario, String linguagem) {
        // Usa 'super' para chamar o construtor da classe Funcionario
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public void codificar() {
        System.out.println(getNome() + " está codificando usando " + linguagem + " no projeto.");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cargo: Programador, Linguagem: " + linguagem);
    }
}