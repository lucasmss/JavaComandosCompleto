package obejeto;

import java.util.Locale;
import java.util.Scanner;

public class Dolla {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DollarCalc dol = new DollarCalc();
		
		
		System.out.println("O preço do dola atual: "+ dol.DOLAR);
		System.out.println("Quantos dolas voce quer comprar??");
		dol.val = sc.nextDouble();
		
		System.out.println("O valor a ser pago em reais: " +dol.Conversor());
		
		
		sc.close();

	}

}
