package obejeto;

import java.util.Locale;
import java.util.Scanner;

public class Exer03Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Exer03func funcionario = new Exer03func();
		
		System.out.println("Digite seu nome: ");
		funcionario.nome = sc.nextLine();
		System.out.println("Digite seu salario bruto: ");
		funcionario.salaBruto = sc.nextDouble();
		System.out.println("Digite o imposto: ");
		funcionario.taxa = sc.nextDouble();
		
		
		System.out.println();
		System.out.println("Funcionario: " + funcionario);
		
		System.out.println();
		System.out.println("Digite a porcentagem de incremento: ");
		double incre = sc.nextDouble();
		funcionario.Incremento(incre);
		
		System.out.println();
		System.out.println("Salario final do Funcionario: " + funcionario.nome + " $ " + funcionario.Incremento(incre));
		
		sc.close();

	}

}
