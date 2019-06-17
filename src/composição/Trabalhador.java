package composição;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
	
	private String name;
	
	private NivelTrabalho level;
	
	private double salarioBase;
	
	private Departamento departamento;
	
	private List<HouraContrato> contratos = new ArrayList<>();

	public Trabalhador() {
	
	}

	public Trabalhador(String name, NivelTrabalho level, double salarioBase, Departamento departamento) {
		this.name = name;
		this.level = level;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NivelTrabalho getLevel() {
		return level;
	}

	public void setLevel(NivelTrabalho level) {
		this.level = level;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamaento() {
		return departamento;
	}

	public void setDepartamaento(Departamento departamaento) {
		this.departamento = departamaento;
	}

	public List<HouraContrato> getContratos() {
		return contratos;
	}

	public void addContrato(HouraContrato contrato) {
		
		contratos.add(contrato);
		
	}
	
	public void removeContrato(HouraContrato contrato) {
		
		contratos.remove(contrato);
		
	}
	
	public double incom(int ano, int mes) {
		
		double sum = salarioBase;
		Calendar cal = Calendar.getInstance();
		for (HouraContrato c : contratos) {
			cal.setTime(c.getData());
			int c_year = cal.get(Calendar.YEAR);
			int c_mes =1 + cal.get(Calendar.MONTH);
			
		if(ano == c_year && mes == c_mes){
			
			sum += c.valorTotal();
		}
			
		}
		return sum;
	}

}
