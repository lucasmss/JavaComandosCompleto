package escrev_ler;

public class Product {
	
	protected String nome;
	protected double preco;
	protected Integer quantidade;
	
	public Product() {
	
	}

	public Product(String nome, double preco, Integer quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public double valorFinal() {
		
		return preco * quantidade;
	}

}
