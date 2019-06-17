package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ListaMain {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Empregado> list = new ArrayList<>();
		
		System.out.println("Qunatos empregados vai adicionar ??");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Digite o id do funcionario:");
			int id = sc.nextInt();
			
			System.out.println("Digite o nome do funcionario:");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Digite o salario do funcionario:");
			double salario = sc.nextDouble();
			
			
			list.add(new Empregado(id, nome, salario));
				
		}
		
		System.out.println();
		System.out.print("Digite o id do funcionario para aumento: ");

		int id = sc.nextInt();

		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null) {

			System.out.println("Essa id não existe!");

		}

		else {

			System.out.print("Coloque a porcentagem: ");

			double percent = sc.nextDouble();

			emp.PorcentoSalario(percent);

		}
		
		System.out.println();
		System.out.println("Lista de empregados:");

		for (Empregado obj : list) {

			System.out.println(obj);

		}
		
		sc.close();

	}

}
