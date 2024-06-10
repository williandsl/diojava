public class ExemplosFor {
    public static void main(String[] args) {

        String alunos[] = { "Felipe", "Willian", "Antonio" };

        // for (int x = 0; x < alunos.length; x++) {
        // System.out.println(alunos[x]);
        // }
        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        // for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
        // System.out.println(carneirinhos);
        // }
        // System.out.println("Willian dormiu");

    }
}
