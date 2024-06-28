
public class Desafio {
  public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in);
    String tipoCofre = scanner.nextLine();

    // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
    if (tipoCofre.equalsIgnoreCase("digital")) {
      int senha = scanner.nextInt();
      int confirmacaoSenha = scanner.nextInt();
      scanner.nextLine(); // Limpar o buffer do scanner

      CofreDigital cofreDigital = new CofreDigital(senha);

      if (cofreDigital.validarSenha(confirmacaoSenha)) {
        cofreDigital.imprimirInformacoes();
        System.out.println("Cofre aberto!");
      } else {
        cofreDigital.imprimirInformacoes();
        System.out.println("Senha incorreta!");
      }
    } else {
      // Se for um cofre físico, cria e exibe suas informações
      CofreFisico cofreFisico = new CofreFisico();
      cofreFisico.imprimirInformacoes();

      scanner.close();
    }
  }
}