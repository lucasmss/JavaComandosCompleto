package ifandElse;

import java.util.Scanner;

public class UsandoIf2 {
	
	public static void main(String[] args) {
		
        // programa para verificar a nota do aluno.

        double n1 = 0.00, n2 = 0.00, n3 = 0.00, media = 0.0;

       Scanner nota = new Scanner(System.in);

        System.out.println("Digite a sua primeira nota !");
        n1 = nota.nextDouble();
        System.out.println("Digite a sua segunda nota !");
        n2 = nota.nextDouble();
        System.out.println("Digite sua terceira nota !");
        n3 = nota.nextDouble();

        media = (n1+n2+n3)/3;

        if(media >= 6){

            System.out.println("Aprovado !");
        }
        else if (media >= 5){

            System.out.println("Recuperação !");
        }
        else{
            System.out.println("Reprovado !");
        }


        nota.close();
	
	}
}
