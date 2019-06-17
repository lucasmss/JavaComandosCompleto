package obejeto;

public class ExerRetan {
	
	public double altura;
	public double largura;
	
	public double Area() {
		
		return altura * largura;
		
	}
	
	public double Perimetro() {
		
		return (altura + largura)*2;
		
	}
	
	public double Diagonal() {
		
		return Math.sqrt((altura*altura) + (largura*largura));
		
	}
	
	public String toString() {
		
		return "Area = "
			+ String.format("%.2f", Area())
			+", Perimetro = "
			+ String.format("%.2f", Perimetro())
			+", Diagonal = "
			+ String.format("%.2f", Diagonal());
		
	}
	

}
