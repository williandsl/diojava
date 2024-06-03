public class aboutMe {
    public static void main(String[] args) {

        String nome = args [0];
        String sobreNome = args [1];
        int idade = Integer.valueOf(args [2]);
        double altura = Double.valueOf(args [3]);


        System.out.println(nome);
        System.out.println(sobreNome);
        System.out.println(idade);
        System.out.println(altura);
    }

    public class Tv {
        int canal = 1;
        void mudarCanal(){
            canal = canal + novoCanal;
        }
    }
}
