package tp3;

import java.util.Date;

public abstract class Plano {

	// Atributos Plano
	String tipo;
	Date dataInicio;
	
	// Metodos
	public String tipo() {
		return this.tipo;
	}
	
	public String dataInicio() {
		return String.valueOf(this.dataInicio);
	}
	
	public boolean editaPlano(String tipo, Date dataInicio, Date dataVencimento) {
		this.tipo = tipo;
		this.dataInicio = dataInicio;
		
		return true;
	}
	
	public boolean deletaPlano() {
		return true;
	}
}
