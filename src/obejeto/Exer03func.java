package obejeto;

public class Exer03func {
	
	public String nome;
	public double salaBruto;
	public double taxa;
	
	
	
	public double Salario() {
		
		return salaBruto - taxa;
		
	}
	
	public double Incremento(double percent) {
		
		return (((percent/100) * salaBruto)+ Salario());
		
	}
	
	public String toString() {
		
		return nome 
			+ ", $ "
			+ String.format("%.2f", Salario());
		
	}

}
