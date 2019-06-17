package obejeto;

import java.util.Locale;
import java.util.Scanner;

public class Exer02Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entra = new Scanner(System.in);

		System.out.println("Entre com os dados do produto !");
		System.out.println("----------------------------- -");
		System.out.println("Nome: ");
		String nome = entra.nextLine();
		System.out.println("Preço: ");
		double preco = entra.nextDouble();
		System.out.println("Quantidade: ");
		int quantidade = entra.nextInt();
		
		Exerci02Produto produto = new Exerci02Produto(nome, preco, quantidade);

		System.out.println();
		System.out.println("Dados do produto: " + produto);

		System.out.println();
		System.out.println("Digite o numero que vai adicionar no estoque ? ");
		quantidade = entra.nextInt();
		produto.AddProduto(quantidade);

		System.out.println();
		System.out.println("Dados Atualizados: " + produto);

		System.out.println();
		System.out.println("Digite o numero que vai retirar no estoque ? ");
		quantidade = entra.nextInt();
		produto.RemoveProduto(quantidade);

		System.out.println();
		System.out.println("Dados Atualizados: " + produto);

		entra.close();

	}

}
