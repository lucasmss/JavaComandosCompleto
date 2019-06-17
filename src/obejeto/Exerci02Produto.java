package obejeto;

public class Exerci02Produto {

	public String nome;
	public double preco;
	public int quantidade;
	
	public Exerci02Produto(String nome, double preco, int quantidade) {
		
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
	}

	public double TotalValor() {

		return preco * quantidade;

	}

	public void AddProduto(int quantidade) {

		this.quantidade += quantidade;

	}

	public void RemoveProduto(int quantidade) {

		this.quantidade -= quantidade;

	}

	public String toString() {

		return nome + ", $" + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: $"
				+ String.format("%.2f", TotalValor());

	}

}
