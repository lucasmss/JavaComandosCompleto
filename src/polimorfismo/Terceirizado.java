package polimorfismo;

public class Terceirizado extends Empregado{
	
	private double adicionalCarga;

	public Terceirizado() {
		super();
	}

	public Terceirizado(String nome, Integer horas, double valorPorHora, double adicionalCarga) {
		super(nome, horas, valorPorHora);
		this.adicionalCarga = adicionalCarga;
	}
	
	@Override
	
	public double pagamento(){
		
		return super.pagamento() + adicionalCarga * 1.1;
	}

}
