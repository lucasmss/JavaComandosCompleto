package vetor;

import java.util.Locale;
import java.util.Scanner;

public class Exerci01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		String nome;
		System.out.println("Digite o número de produtos a adicionar");
		n = sc.nextInt();
		
		Produ01[] vet = new Produ01[n];
		
		for(int i =0; i< vet.length; i++) {
			System.out.println("Digite o nome e o preço");
			sc.nextLine();
			nome = sc.nextLine();
			double preco =sc.nextDouble();
			vet[i] = new Produ01(nome, preco);
		
		}
		
		double soma = 0;
		
		for(int i=0; i<vet.length; i++) {
			
			soma += vet[i].getPreco();
		}
		
		double media = 0;
		
		media += soma/vet.length;
		
		System.out.println();
		System.out.printf("A media total é: %.2f%n", media);

		sc.close();
	}

}
