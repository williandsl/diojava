import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia = AGENCIA_PADRAO;
    protected int numero = SEQUENCIAL++;
    protected double saldo;
    private Cliente cliente;
    private List<String> historicoTransacoes = new ArrayList<>();
    private boolean bloqueada = false;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor de saque deve ser maior que zero.");
            return;
        }
        if (bloqueada) {
            System.out.println("Erro: Conta bloqueada. Não é possível realizar saques.");
            return;
        }
        if (valor > saldo) {
            System.out.println("Erro: Saldo insuficiente para realizar o saque.");
            return;
        }
        saldo -= valor;
        historicoTransacoes.add(String.format("Saque de %.2f realizado.", valor));
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor de depósito deve ser maior que zero.");
            return;
        }
        if (bloqueada) {
            System.out.println("Erro: Conta bloqueada. Não é possível realizar depósitos.");
            return;
        }
        saldo += valor;
        historicoTransacoes.add(String.format("Depósito de %.2f realizado.", valor));
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor <= 0) {
            System.out.println("Erro: O valor de transferência deve ser maior que zero.");
            return;
        }
        if (bloqueada) {
            System.out.println("Erro: Conta bloqueada. Não é possível realizar transferências.");
            return;
        }
        if (valor > saldo) {
            System.out.println("Erro: Saldo insuficiente para realizar a transferência.");
            return;
        }
        this.sacar(valor);
        contaDestino.depositar(valor);
        historicoTransacoes.add(String.format("Transferência de %.2f realizada para conta %d.", valor, contaDestino.getNumero()));
    }

    protected void printInfoComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", agencia));
        System.out.println(String.format("Número: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }

    public void bloquearConta() {
        this.bloqueada = true;
        historicoTransacoes.add("Conta bloqueada.");
    }

    public void desbloquearConta() {
        this.bloqueada = false;
        historicoTransacoes.add("Conta desbloqueada.");
    }

    public void imprimirExtrato() {
        System.out.println("### Extrato da Conta ###");
        printInfoComuns();
        System.out.println("### Histórico de Transações ###");
        for (String transacao : historicoTransacoes) {
            System.out.println(transacao);
        }
        System.out.println("##########################");
    }
}
