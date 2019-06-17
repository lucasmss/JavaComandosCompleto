package obejeto;

import java.util.Scanner;

public class SemObjeto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Triangulo x, y;

		x = new Triangulo();		//Começo da implementação de objeto
		y = new Triangulo();		//Comeco da implementação de objeto

		System.out.println("Digite os 3 lados do triangulo x");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Digite os 3 lados do triangulo y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double p = (x.a + x.b + x.c) / 2;
		double areax = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

		p = (y.a + y.b + y.c) / 2;

		double areay = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

		System.out.printf("Triangulo x area: %.4f%n", areax);
		System.out.printf("Triangulo y area: %.4f%n", areay);

		if (areax > areay) {

			System.out.println("Maior area: x ");

		} else {

			System.out.println("Maior area: y ");

		}

		sc.close();

	}

}
