package forr;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
	
		//Numeros divisiveis do numero digitado pelo usuario
		Scanner x = new Scanner(System.in);
		
		int n = 0;
		
		System.out.println("Digite um numero inteiro e veja seus divisores !!");
		n = x.nextInt();
		
		if(n > 0) {
		
		for(int i = 1; i <= n; i++) {
			
			
			if((n % i) == 0){
				
				System.out.println("Divisores de "+ n +" São "+ i);
				
			}
			
			
		}
		
		}
		else {
			
			System.out.println("Número invalido !!");
			
		}
		
		x.close();
		

	}

}
