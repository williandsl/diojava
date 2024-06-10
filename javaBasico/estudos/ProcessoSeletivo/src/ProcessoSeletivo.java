import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {

        String[] candidatos = {
                "Felipe", "Gabriel", "Mariana", "Lucas", "Beatriz",
                "Matheus", "Isabela", "Rafael", "Juliana", "Gustavo",
                "Ana", "Daniel", "Carolina", "Pedro", "Larissa",
                "Bruno", "Camila", "Vinícius", "Natália", "Thiago"
        };

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
        // analisarCandidato(1900.0);
        // analisarCandidato(2200.0);
        // analisarCandidato(2000.0);
        // selecaoCandidatos();
        // imprimirSelecionados();
    }

    static void entrandoEmContato(String candidato) {
        int tentatiasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentatiasRealizadas++;
            } else {
                System.out.println("contato realizado");
            }

        } while (continuarTentando && tentatiasRealizadas < 3);

        if (atendeu) {
            System.out.println("Candidato " + candidato + " atendeu, tentativa " + tentatiasRealizadas);
        } else {
            System.out.println("Candidato " + candidato + " não atendeu tentativa " + tentatiasRealizadas);
        }

    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void selecaoCandidatos() {
        String[] candidatos = {
                "Felipe", "Gabriel", "Mariana", "Lucas", "Beatriz",
                "Matheus", "Isabela", "Rafael", "Juliana", "Gustavo",
                "Ana", "Daniel", "Carolina", "Pedro", "Larissa",
                "Bruno", "Camila", "Vinícius", "Natália", "Thiago"
        };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " salario  " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "Felipe", "Marcia" };
        // for (int indice = 0; indice < candidatos.length; indice++) {
        // System.out.println("Candidato de n " + (indice + 1) + " e " +
        // candidatos[indice]);
        // }
        for (String candidato : candidatos) {
            System.out.println("Candidato de n " + candidato);
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.00, 2200.00);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o Candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o Candidato e discutir detalhes");

        } else {
            System.out.println("Não Ligar para o Candidato");
        }
    }
}
