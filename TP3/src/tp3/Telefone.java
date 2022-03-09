package tp3;

public class Telefone {

	// Atributos Telefone
	private long ddd;
	private long numero;
	
	// Construtor
	public Telefone(long ddd, long numero) {
		this.ddd = ddd;
		this.numero = numero;
	}
	
	// Metodos
	public String ddd() {
		return String.valueOf(this.ddd);
	}
	
	public String numero() {
		return String.valueOf(this.numero);
	}
	
	public boolean editaTelefone(long ddd, long numero) {
		this.ddd = ddd;
		this.numero = numero;
		
		return true;
	}
	
	public boolean deletaTelefone() {
		
		return true;
	}
}
