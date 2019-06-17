package whileee;

import java.util.Scanner;

public class Whilee {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		int n = 0, cont = 1, conta = 0;
		
		System.out.println("Digite um numero inteiro de quantos impares voce quer ver !!!!");
		n = x.nextInt();
		
		if(n > 0) {
			
		while(cont <= n) {
			
			if((cont % 2) == 1) {
				
			System.out.println(cont);
			
			
			}
			
			cont = cont + 1 ;
		}
		}
		else {
			
			System.out.println("Número invalido !!");
			
		}
		
		x.close();
	}

}
