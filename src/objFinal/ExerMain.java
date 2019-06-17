package objFinal;

import java.util.Locale;
import java.util.Scanner;

public class ExerMain {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Banco banco;
		
		System.out.println("Bem vindo ao Banco");
		System.out.println("Digite o numero da conta !");
		int conta = sc.nextInt();
		System.out.println("Digite o nome do dona da conta !");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Voce quer fazer um deposito inicial ?? (s/n)");
		char inic = sc.next().charAt(0);
		if(inic == 's' || inic =='S') {
		
		System.out.println("Digite o valor do deposito inicial !");	
			double depositoInicial = sc.nextDouble();
			
			 banco = new Banco(conta, nome, depositoInicial);
			
		}else {
			
			 banco = new Banco(conta, nome);
		}
			
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(banco);
		
		System.out.println();
		System.out.println("Digite um valor para deposito !");
		double valorD = sc.nextDouble();
		banco.Deposito(valorD);
		System.out.println("Atualização dos dados da conta !");
		System.out.println(banco);
		
		System.out.println();
		System.out.println("Digite um valor para sacar !");
		double valorS = sc.nextDouble();
		banco.Sacar(valorS);
		System.out.println("Atualização dos dados da conta !");
		System.out.println(banco);
		
		
		sc.close();

	}

}
