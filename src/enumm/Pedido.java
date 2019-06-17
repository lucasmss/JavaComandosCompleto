package enumm;

import java.util.Date;

public class Pedido {

	private int Integer;
	private Date moment;
	private Order status;
	
	public Pedido(int integer, Date moment, Order status) {
		
		Integer = integer;
		this.moment = moment;
		this.status = status;
	}

	public int getInteger() {
		return Integer;
	}

	public void setInteger(int integer) {
		Integer = integer;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Order getStatus() {
		return status;
	}

	public void setStatus(Order status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [Integer=" + Integer + ", moment=" + moment + ", status=" + status + "]";
	}
	

}
