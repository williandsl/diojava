import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        Scanner entradaUsuario = new Scanner(System.in);
        int conta;
        String agencia;
        String nomeCliente;
        double saldo;

        try {
            System.out.println("Por favor, digite o número da conta!");
            conta = Integer.valueOf(entradaUsuario.nextLine());
    
            System.out.println("Por favor, digite o número da Agência!");
            agencia = entradaUsuario.nextLine();
    
            System.out.println("Por favor, digite seu nome!");
            nomeCliente = entradaUsuario.nextLine();
    
            System.out.println("Por favor, digite o saldo que vai depositar!");
            saldo = Double.valueOf(entradaUsuario.nextLine());
    
            System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+ " já está disponível para saque.");
        } catch (Exception e) {
            System.out.println("Informacao invalida, comece de novo");
        }
    
    }


}
