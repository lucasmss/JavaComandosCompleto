package forr;

import java.util.Scanner;

public class Forr {

	public static void main(String[] args) {
		
		//Digite um numero e veja seus antecessores.
		
		System.out.println("Digite um número e veja seus antecessores !");
		int n = 0;
		Scanner x = new Scanner(System.in);
		
		n = x.nextInt();
		
		for (int i = 0; i <= n; i++) {
			
			System.out.println("Os antecessores de "+ n +" são = "+ i);
			
		}
		
		x.close();

	}

}
