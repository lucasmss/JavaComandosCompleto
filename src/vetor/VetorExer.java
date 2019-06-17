package vetor;

import java.util.Locale;
import java.util.Scanner;

public class VetorExer {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double [] vect = new double[n];
		
		for(int i =0; i < n; i++) {
			
			vect[i] = sc.nextDouble();
			
		}
		
		double soma = 0;
		
		for(int i = 0; i < n ; i++) {
			
			soma += vect[i];
		}
		
		double media = 0;
		
		media = soma/n;
		
		System.out.printf("A media das altura é: %.2f%n", media);
		
		
		sc.close();
	}

}
