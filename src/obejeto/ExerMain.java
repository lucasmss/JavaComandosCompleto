package obejeto;

import java.util.Locale;
import java.util.Scanner;

public class ExerMain {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ExerRetan retangulo = new ExerRetan();
		
		System.out.println("Digite a altura de um retangulo: ");
		retangulo.altura = sc.nextDouble();
		
		System.out.println();
		System.out.println("Digite a largura de um retangulo: ");
		retangulo.largura = sc.nextDouble();
		
		System.out.println();
		System.out.println(retangulo);
		
		
		sc.close();
	}

}
