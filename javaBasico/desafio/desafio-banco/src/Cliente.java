import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cliente {
    protected Integer id;
    protected String nome;
    protected Long cpf;
    protected String endereco;
    protected String email;

}
