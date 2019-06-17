package doWhile;

import java.util.Scanner;

public class DoWhilee {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		int n1 = 0, n2 = 0;	
		int soma = 0;
		int valid = 0;
		do {
			
			System.out.println("Digite dois números para somar");
			n1 = x.nextInt();
			n2 = x.nextInt();	
			
			soma = n1 + n2;
			System.out.println("A soma é = "+soma);
			System.out.println();
			System.out.println("Deseja fazer outra conta ??  yes(1) no(2)");
			valid = x.nextInt();
			System.out.println();
			
		}while(valid == 1);
		
		x.close();
	}

}
