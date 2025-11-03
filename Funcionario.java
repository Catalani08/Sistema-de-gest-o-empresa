public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirInformacoes () {
        System.out.println("Nome: " + nome + ", Salario: R$" + String.format("%.2f", salario));

    }

    //Getters para acesso pelas subclasses
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }
    
}
