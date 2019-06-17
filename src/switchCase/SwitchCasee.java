package switchCase;

import java.util.Scanner;

public class SwitchCasee {

	public static void main(String[] args) {
		
		//Dias da semana
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("Digite de 1 a 7 e veja o dia da semana");
		
		int n = x.nextInt();
		
		switch (n) {
		
		case 1:
			
			System.out.println("Dmingo");
			
			break;
			
		case 2:	
		
			System.out.println("Segunda");
			
			break;
			
		case 3:
			
			System.out.println("Terça");
			
			break;
			
		case 4:
			
			System.out.println("Quarta");
			
			break;
			
			
		case 5:
			
			System.out.println("Quinta");
			
			break;
			
		case 6:
			
			System.out.println("Sexta");
			
			break;
			
		case 7:
			
			System.out.println("Sabado");
			
			break;
			
		default:
			
			System.out.println("Número invalido");
			
		}
		
		x.close();

	}

}
