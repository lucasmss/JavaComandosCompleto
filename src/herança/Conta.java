package herança;

public class Conta {

	private Integer numero;
	private String nome;
	protected double conta;
	
	public Conta() {
		
	}

	public Conta(Integer numero, String nome, double conta) {
		
		this.numero = numero;
		this.nome = nome;
		this.conta = conta;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getConta() {
		return conta;
	}

	public void deposito(double valor) {
		
		conta += valor;
		
	}
	
	public void sacar(double valor) {
		
		conta -= valor;
		
	}
	
	
}
