import lombok.Data;

import java.util.List;
@Data
public class Banco {
    protected String nome;
    protected String endereco;
    protected int codigo;
    protected List<Conta> contas;
}
