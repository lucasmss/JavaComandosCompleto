package ifandElse;

import java.util.Scanner;

public class UsandoIf {

	public static void main(String[] args) {
	

        //If and Else, usado para avaliar uma expressão como sendo verdadeira ou falsa.

        //Programa para verificar a idade da pessoa.

        Scanner x = new Scanner(System.in);

        int idade = 0;
        System.out.println("Digite sua idade");
        idade = x.nextInt();

        if (idade >= 18){

            System.out.println("Você é maior de idade!");

        }
        else if((idade < 18) && (idade > 0)){

            System.out.println("Você é menor de idade!!");

        }
        else{

            System.out.println("Idade invalido");
        }
        
        x.close();

	}

}
