package funcao;

import java.util.Scanner;

public class Funcao02 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		/*Digite 3 numeros e diga qual é o maior */
		
		System.out.println("Digite 3 numeros e veja o maior");
		
		int a = x.nextInt(); 
		int b = x.nextInt(); 
		int c = x.nextInt();

		int maior = max(a, b, c);
		
		result(maior); 
		
		x.close();
		
	}

	public static int max(int x, int z, int y) {
		int aux = 0;
		
		if(x > z && x > y) {
			
			aux = x;
		}
		else if (z > y) {
			
			aux = z;
			
		}
		else {
			
			aux = y;
			
		}
		
		return aux;	
	}
	
	public static void result(int valor) {
		
		System.out.println("O maior valor é = "+ valor);
		
	}
	
	
}
