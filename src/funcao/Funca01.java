package funcao;

import java.util.Scanner;

public class Funca01 {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		//Digite 3 numeros e diga qual � o maior
		
		System.out.println("Digite 3 numeros e veja o maior");
		
		int a = x.nextInt(); 
		int b = x.nextInt(); 
		int c = x.nextInt();
		
		if(a > b && a > c) {
			
			System.out.println("O maior � = "+ a);
		}
		else if(b > c){
			System.out.println("O maior � = "+ b);
			
		}
		else {
			System.out.println("O maior � = "+ c);
			
		}
		
		x.close();
		
	}

}
