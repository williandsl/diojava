import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        System.out.println("Bem vindo ao Banco, Selecione uma opcao");

        menuPrincipal();

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Qual o valor do deposito?");
                    double deposito = scanner.nextDouble();
                    saldo = saldo + deposito;
                    System.out.println("Deposito de: " + deposito + " Saldo atual: " + saldo);
                    menuPrincipal();
                    break;
                case 2:
                    System.out.println("Qual o valor do saque?");
                    double saque = scanner.nextDouble();
                    saldo = validarSaldo(saldo, saque);
                    menuPrincipal();
                    break;
                case 3:
                    System.out.println("O Seu saldo atual e: " + saldo);
                    menuPrincipal();
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false; // Atualiza a variável de controle para encerrar o loop
                    menuPrincipal();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    private static double validarSaldo(double saldo, double saque) {
        if (saque > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo = saldo - saque;
            System.out.println("Deposito de: " + saque + " Saldo atual: " + saldo);
        }
        return saldo;
    }

    private static void menuPrincipal() {
        System.out.println("1 - Depositar\n" + //
                "2 - Sacar\n" + //
                "3 - Consultar Saldo\n" + //
                "0 - Encerrar");
    }
}