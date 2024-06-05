public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        // if (nota >= 7) {
        // System.out.println("Aprovado");
        // } else if (nota >= 5 && nota < 7) {
        // System.out.println("Recuperacao");
        // } else {
        // System.out.println("Reprovado");
        // }

        // ternario simples
        // String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        // ternario com elseif
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperacao" : "Reprovado";

        System.out.println(resultado);
    }
}
