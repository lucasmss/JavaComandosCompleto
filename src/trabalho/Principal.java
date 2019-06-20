package trabalho;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> empregado = new ArrayList<>();
		
		
		System.out.print("Digite o número de funcionários: ");
		int n = sc.nextInt();
		
		for(int i=1; n>=i; i++) {
			
			System.out.println("Dados do #"+ i +" funcionário: ");
			System.out.print("Terceirizado ??(y/n)");
			char ch =sc.next().charAt(0);
			
			System.out.println("Digite seu nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Digiote as horas:");
			int horas = sc.nextInt();
			
			System.out.println("Digite o valor da hora:");
			double valorPorHora = sc.nextDouble();
			
			if (ch == 'y'){
				
				System.out.println("Digite a carga a dicional");
				double adicional = sc.nextDouble();
				
				Empregado emp = new Terceirizado(nome, horas, valorPorHora, adicional);
				
				empregado.add(emp);
			
			}else {
				
				Empregado emp = new Empregado(nome, horas, valorPorHora);
				empregado.add(emp);
			}
			
			
		}
		
		
		System.out.println();
		System.out.println("Pagamento: ");
		for(Empregado emp : empregado) {
			
			System.out.println(emp.getNome()+" $ "+ String.format("%.2f", emp.pagamento()));
		}
		
		
		sc.close();
		

	}

}
