package set;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Set<Users> set = new HashSet<>();

		System.out.print("How many students for course A ??");
		int alunos = sc.nextInt();

		for (int i = 1; alunos >= i; i++) {

			int code = sc.nextInt();

			set.add(new Users(code));
		}

		System.out.print("How many students for course B ??");
		int alunosB = sc.nextInt();

		for (int i = 1; alunosB >= i; i++) {

			int code = sc.nextInt();

			set.add(new Users(code));
		}

		System.out.print("How many students for course C ??");
		int alunosC = sc.nextInt();

		for (int i = 1; alunosC >= i; i++) {

			int code = sc.nextInt();

			set.add(new Users(code));
			
		}

		System.out.println("O total de alunos é: " + set.size());

	}

}
