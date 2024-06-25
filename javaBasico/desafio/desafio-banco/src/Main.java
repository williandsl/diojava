public class Main {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        cliente.setNome("Willian");

        Conta cc = new ContaCorrente(cliente);
        cc.depositar(100);
        Conta poupanca = new ContaPoupanca(cliente);
        cc.transferir(10, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
