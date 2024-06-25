import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = ContaUtils.criarClientes();
        List<ContaCorrente> contasCC = ContaUtils.criarContasCorrente(clientes);
        List<ContaPoupanca> contaPP = ContaUtils.criarContasPoupanca(clientes);

        ContaUtils.inicializarContas(contasCC, contaPP);

        // Transferir R$ 350 da conta corrente para a conta poupança
        for (int i = 0; i < contasCC.size(); i++) {
            ContaCorrente cc = contasCC.get(i);
            ContaPoupanca poupanca = contaPP.get(i);
            cc.transferir(350, poupanca);
        }

        // Imprimir extratos das contas corrente
        for (ContaCorrente conta : contasCC) {
            conta.imprimirExtrato();
        }

        // Bloquear contas poupança
        for (ContaPoupanca conta : contaPP) {
            conta.bloquearConta();
        }
        System.out.println("#######################################");
        contasCC.get(1).transferir(2000, contaPP.get(1));
        contasCC.get(3).sacar(5000);
        System.out.println("#######################################");




        // Imprimir extratos das contas poupança bloqueadas
        for (ContaPoupanca conta : contaPP) {
            if (conta.isBloqueada()) {
                System.out.println("Conta bloqueada para saque");
                conta.sacar(100);
                conta.imprimirExtrato();
            }
        }

        // Desbloquear contas poupança específicas e realizar saque
        for (ContaPoupanca conta : contaPP) {
            if (conta.getCliente().getId() >= 4 && conta.isBloqueada()) {
                conta.desbloquearConta();
                System.out.println("Conta desbloqueada para saque");
                conta.sacar(50);
                conta.imprimirExtrato();
            }
        }
    }
}
