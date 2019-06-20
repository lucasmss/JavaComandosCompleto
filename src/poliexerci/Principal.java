package poliexerci;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> produtos = new ArrayList<>();
		
		System.out.println("Digite o número de produtos: ");
		int n = sc.nextInt();
		
		for(int i =1; n>=i; i++){
			
			System.out.println("Dados do produto # "+ i +" pedido:");
			System.out.println("Comum (c), importado (i) ou usado (u) ");
			char ch = sc.next().charAt(0);
			
			System.out.println("Digite o nome do produto:");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Digite o preço: ");
			double preco = sc.nextDouble();
			
			if(ch =='c') {
				
			Produto produto = new Produto(nome, preco);
			
			produtos.add(produto);
			
			}
			else if(ch == 'i') {
				
				System.out.println("Digite o preço do frete:");
				double frete = sc.nextDouble();
				
				Importado importado = new Importado(nome, preco, frete);
				
				produtos.add(importado);
				
			}
			else if (ch == 'u'){
			
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				
				Usado usado = new Usado(nome, preco, date);
				
				produtos.add(usado);
				
			}
			
		}
			
			System.out.println();
			System.out.println("Peço tags:");
			for (Produto prod : produtos) {
				System.out.println(prod.getNome()+" $ "+prod.tagpreco());
			}
	
		
	sc.close();	
		
	}

}
