package vetor;

import java.util.Locale;
import java.util.Scanner;

public class Exer02Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Exer02[] vet = new Exer02[10];
		
		System.out.println("Quantos quartos voce quer ??");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Digite o seu nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Digite seu email:");
			String email = sc.nextLine();
			System.out.println("Digite o numero do quarto");
			int numero = sc.nextInt();

			vet[numero] = new Exer02(nome, email);	
			
		}
		System.out.println();
		System.out.println("Quartos ocupados");
		
		for(int i = 0; i < 10; i++) {
			
			if(vet[i] != null) {
				
				System.out.println(i + ": "+vet[i]);
			}
			
		}
		
		
		
		
		sc.close();

	}

}
