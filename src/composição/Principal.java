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
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Nivel: ");
		String level = sc.nextLine();
		System.out.print("Salário base: ");
		Double salarioBase = sc.nextDouble();
		
		Trabalhador Trabalhador = new Trabalhador(name, NivelTrabalho.valueOf(level), salarioBase, new Departamento(departamentoName));	
		
		System.out.print("Quantos contratos o trabalhador tem??");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			
			System.out.println("Contratos que entraram # "+ i +" dados");
			System.out.print("Data(DD/MM/YYYY):");
			Date contratoData = sdf.parse(sc.next());
			System.out.print("Valor por hora ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração em horas ");
			int horas = sc.nextInt();
			
			HouraContrato contrato = new HouraContrato(contratoData, valorPorHora, horas);
			Trabalhador.addContrato(contrato);
		
		}
		
		System.out.println();
		System.out.print("Entre com a dada e o ano para calcular o salário(MM/YYYY): ");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		
		System.out.println("Nome: "+Trabalhador.getName());
		System.out.println("Departamento: "+Trabalhador.getDepartamaento().getName());
		System.out.println("Incom for: "+mesEAno+" : "+String.format("%.2f", Trabalhador.incom(ano, mes)));
		

		
		sc.close();
	}

}
