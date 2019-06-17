package composição;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyyy");
		
		System.out.print("Entre com o nome do departamento: ");
		String departamentoName = sc.nextLine();
		
		System.out.println("Digite os dados do trabalhador");
		System.out.println("Nome: ");
		String name = sc.nextLine();
		System.out.println("Nivel: ");
		String level = sc.nextLine();
		System.out.println("Salário base: ");
		Double salarioBase = sc.nextDouble();
		
		Trabalhador Trabalhador = new Trabalhador(name, NivelTrabalho.valueOf(level), salarioBase, new Departamento(departamentoName));	
		
		System.out.println("Quantos contratos o trabalhador tem??");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			
			System.out.println("Contratos que entraram#"+ i +"dados");
			System.out.print("Data(DD/MM/YYYY):");
			Date contratoData = sdf.parse(sc.next());
			System.out.println("Valor por hora");
			double valorPorHora = sc.nextDouble();
			System.out.println("Duração em horas");
			int horas = sc.nextInt();
			
			HouraContrato contrato = new HouraContrato(contratoData, valorPorHora, horas);
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
