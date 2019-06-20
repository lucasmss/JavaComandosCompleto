package herança;

public class ContaDeNegocio extends Conta {
	
	private double emprestimoLimit;

	public ContaDeNegocio() {
	
		super();
	}

	public ContaDeNegocio(Integer numero, String nome, double conta, double emprestimoLimit) {
		super(numero, nome, conta);
		this.emprestimoLimit = emprestimoLimit;
	}

	public double getEmprestimoLimit() {
		return emprestimoLimit;
	}

	public void setEmprestimoLimit(double emprestimoLimit) {
		this.emprestimoLimit = emprestimoLimit;
	}
	
	public void emprestimo(double valor) {
		if(valor >= emprestimoLimit) {
			conta += valor -10.0;
		}
		
	}
	
	
	
	// super é quando for necessário fazer uma sobreposição.

}
