package tp3;

import java.util.Date;

public class PlanoPago extends Plano {
	
	// Atributos
	private float valor;
	
	// Construtor
	public PlanoPago(String tipo, Date dataInicio, Date dataVencimento, float valor) {
		this.tipo = tipo;
		this.dataInicio = dataInicio;
		this.dataVencimento = dataVencimento;
		this.valor = valor;	
	}
	
	// Metodos
	public String valor() {
		return String.valueOf(this.valor);
	}
	
	public boolean editaPlano(String tipo, Date dataInicio, Date dataVencimento, float valor) {
		this.tipo = tipo;
		this.dataInicio = dataInicio;
		this.dataVencimento = dataVencimento;
		this.valor = valor;
		
		return true;
	}
}
