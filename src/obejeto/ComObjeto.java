package obejeto;

import java.util.Scanner;

public class ComObjeto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Triangulo x, y;

		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Digite os 3 lados do triangulo x");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Digite os 3 lados do triangulo y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areax = x.area();

		double areay = y.area();

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
