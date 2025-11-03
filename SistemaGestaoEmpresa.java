public class SistemaGestaoEmpresa {
    public static void main(String[] args) {
        // 1. Instanciação de Funcionários (Polimorfismo implícito)
        Programador p1 = new Programador("Alice Code", 6500.00, "Java");
        Analista a1 = new Analista("Charlie Data", 7200.00, "Dados");
        
        // 2. Criação do Gerente (usando a classe base Funcionario)
        Funcionario gerenteTati = new Funcionario("Tati Manager", 8500.00);
        
        // 3. Instanciação do Departamento (Composição)
        Departamento TI = new Departamento("Tecnologia e Inovação", gerenteTati);

        // --- Demonstração ---
        
        // Exibe os detalhes usando o objeto Gerente (Composição)
        TI.exibirDetalhes();

        System.out.println("\n*** DEMONSTRAÇÃO DO TRABALHO ***");
        
        // Demonstração da Herança e Métodos Específicos
        System.out.println("\n--- Programador ---");
        p1.exibirInformacoes(); // Usa método herdado e sobrescrito
        p1.codificar();         // Usa método específico

        System.out.println("\n--- Analista ---");
        a1.exibirInformacoes(); // Usa método herdado e sobrescrito
        a1.analisarDados();     // Usa método específico
    }
}
