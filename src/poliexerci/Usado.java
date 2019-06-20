package poliexerci;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Usado extends Produto{
	
	protected Date data;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Usado() {
		super();
	}

	public Usado(String nome, double preco, Date data) {
		super(nome, preco);
		this.data = data;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	@Override 
	public String tagpreco() {
		
		return "(used) "+super.tagpreco() + " (Data da fabricação: "+ sdf.format(getData())+" )";
		
	}
	

}
