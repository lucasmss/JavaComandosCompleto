package objFinal;

public class Banco {

	private int conta;
	private String nome;
	private double saldo;
	
	public Banco(int conta, String nome) {
		
		this.conta = conta;
		this.nome = nome;
	}

	public Banco(int conta, String nome, double depositoInicial) {
		
		this.conta = conta;
		this.nome = nome;
		Deposito(depositoInicial);
		
	}
	
	public int getConta() {
		return conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void Deposito(double valorD) {
		
		saldo += valorD;
		
	}
	
	public void Sacar(double valorS) {
		
		saldo -= valorS + 5.00;
		
	}
	
	public String toString() {
		
		return "Conta "
				+conta
				+", nome: "
				+nome
				+", saldo: $ "
				+String.format("%.2f", saldo);
	}
	
}
