import java.util.ArrayList;
import java.util.List;

public class ContaUtils {

    public static List<Cliente> criarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(1,"Ana Silva", 11122233344L, "Rua X, 100", "ana@email.com"));
        clientes.add(new Cliente(2,"Carlos Oliveira", 22233344455L, "Av. Y, 200", "carlos@email.com"));
        clientes.add(new Cliente(3,"Mariana Santos", 33344455566L, "Praça Z, 300", "mariana@email.com"));
        clientes.add(new Cliente(4,"Pedro Almeida", 44455566677L, "Rua W, 400", "pedro@email.com"));
        clientes.add(new Cliente(5,"Juliana Costa", 55566677788L, "Av. V, 500", "juliana@email.com"));
        return clientes;
    }

    public static List<ContaCorrente> criarContasCorrente(List<Cliente> clientes) {
        List<ContaCorrente> contasCC = new ArrayList<>();
        for (Cliente cliente : clientes) {
            ContaCorrente conta = new ContaCorrente(cliente);
            contasCC.add(conta);
        }
        return contasCC;
    }

    public static List<ContaPoupanca> criarContasPoupanca(List<Cliente> clientes) {
        List<ContaPoupanca> contaPP = new ArrayList<>();
        for (Cliente cliente : clientes) {
            ContaPoupanca conta = new ContaPoupanca(cliente);
            contaPP.add(conta);
        }
        return contaPP;
    }

    public static void inicializarContas(List<ContaCorrente> contasCC, List<ContaPoupanca> contaPP) {
        for (ContaCorrente conta : contasCC) {
            conta.depositar(1000);
            conta.sacar(100);
        }
        for (ContaPoupanca conta : contaPP) {
            conta.depositar(1000);
        }
    }
}
