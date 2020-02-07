import java.util.Scanner;

public class Adivinha {

    private Scanner entrada = new Scanner(System.in);
    private boolean jogoAtivo = true;


    public void  jogar(){

        System.out.println("Olá Qual seu nome?");
        String nomeDoJogador = entrada.nextLine();
        System.out.printf("Bem vindo %s, vamos começar\n", nomeDoJogador);

        while(jogoAtivo) {
            int vezesJogadas =0;
            int min = 0;
            int max = 100;
            int numeroX = (int) (Math.random() * (max - min) + 1);

            System.out.printf("%s, foi digitado um numero entre %d e %d, adivinhe\n", nomeDoJogador, min, max);
            int numeroDoJogador;

            do {

                System.out.println("Escolha um numero entre 0 e 100");
                numeroDoJogador = entrada.nextInt();
                if(numeroDoJogador > numeroX){
                    System.out.println("Numero muito alto, adivinhe de novo");
                }else if (numeroDoJogador < numeroX){
                    System.out.println("Numero muito baixo, adivinhe de novo");
                }

                vezesJogadas++;
            } while (numeroDoJogador != numeroX);

            System.out.printf("Acertou!!, %s Você jogou %d\n", nomeDoJogador,vezesJogadas);


            System.out.println("Deseja jogar novamente?? se sim (1) se não (2)");
            int jogardenovo = entrada.nextInt();

            if (jogardenovo == 1){
                jogoAtivo = true;
            }else {
                jogoAtivo = false;
            }
        }


        entrada.close();

    }
}
