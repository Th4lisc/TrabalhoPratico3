package tp3;

import java.util.Date;

public class PlanoPago extends Plano {
	
	// Atributos
	private double valor;
	
	// Construtor
	public PlanoPago(String tipo, Date dataInicio, double valor) {
		this.tipo = tipo;
		this.dataInicio = dataInicio;
		this.valor = valor;	
	}
	
	// Metodos
	public String valor() {
		return String.valueOf(this.valor);
	}
	
	public boolean editaPlano(String tipo, Date dataInicio, Date dataVencimento, double valor) {
		this.tipo = tipo;
		this.dataInicio = dataInicio;
		this.valor = valor;
		
		return true;
	}
}
