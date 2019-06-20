package poliexerci;

public class Importado extends Produto{
	
	protected double custoFrete;

	public Importado() {
		super();
	}

	public Importado(String nome, double preco, double custoFrete) {
		super(nome, preco);
		this.custoFrete = custoFrete;
	}
	
	public double getCustoFrete() {
		return custoFrete;
	}

	public void setCustoFrete(double custoFrete) {
		this.custoFrete = custoFrete;
	}

	@Override 
	public String tagpreco() {
		
		return precoTotal() +" (custo frete: $ "+ custoFrete +" )";
		
	}
	
	public double precoTotal(){
		
		return super.preco + custoFrete; 
	}

}
