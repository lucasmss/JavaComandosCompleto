package whileee;

import java.util.Scanner;

public class while02 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		System.out.println("Digite um número que quer para somar");
		
		int n = x.nextInt();
		
		while (n <= 0) {
			
			System.out.println("Digite um valor posistivo !!");
			System.out.println();
			System.out.println("Digite um número que quer para somar");
			
			
			n = x.nextInt();
		}
		
		int soma = 0;
		int num = 0;
		for(int i = 1; i<= n; i++) {
			
			System.out.println("Valor # "+ i +" : ");
			num = x.nextInt();
			soma += num;
			
		}
		System.out.println();
		System.out.println("Valor da soma é = "+ soma);
		
		
		x.close();
	}

}
