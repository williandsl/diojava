import java.util.Scanner;

public class VerificadorElegibilidadeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();

        // TODO: Verificar se a idade do cliente
        // TODO: Se >= 18, imprimir "Voce esta elegivel para criar uma conta bancaria."
        // TODO: Caso contrário, imprimir "Voce nao esta elegivel para criar uma conta
        // bancaria."

        String verificador = idade >= 18 ? "Voce esta elegivel para criar uma conta bancaria."
                : "Voce nao esta elegivel para criar uma conta bancaria.";

        System.out.println(verificador);
        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}