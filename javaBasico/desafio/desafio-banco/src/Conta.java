import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia = AGENCIA_PADRAO;
    protected int numero = SEQUENCIAL++;
    protected double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void printInfoComuns() {
        System.out.println(String.format("Titular %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia %d", agencia));
        System.out.println(String.format("Numero %d", numero));
        System.out.println(String.format("Saldo %.2f", saldo));
    }
}
