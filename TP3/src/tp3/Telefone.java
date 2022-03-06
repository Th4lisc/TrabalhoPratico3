package tp3;

public class Telefone {

	// Atributos Telefone
	private int ddd;
	private int numero;
	
	// Construtor
	public Telefone(int ddd, int numero) {
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
	
	public boolean editaTelefone(int ddd, int numero) {
		this.ddd = ddd;
		this.numero = numero;
		
		return true;
	}
	
	public boolean deletaTelefone() {
		
		return true;
	}
}
