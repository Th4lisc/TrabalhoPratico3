package tp3;

public class Bicicleta {

	// Atributos
	private int id;
	private boolean status;
	private String tipo;
	private int aro;
	private String cor;
	private float peso;
	private int kmPedalado;
	
	// Construtor
	public Bicicleta(int id, boolean status, int aro, String cor, float peso, int kmPedalado) {
		this.id = id;
		this.status = status;
		this.aro = aro;
		this.cor = cor;
		this.peso = peso;
		this.kmPedalado = kmPedalado;
	}
	
	// Metodos
	public String id() {
		return String.valueOf(this.id);
	}
	
	public String status() {
		if (status) {
			return "true";
		}
		else {
			return "false";
		}
	}
	
	public String tipo() {
		return this.tipo;
	}
	
	public String aro() {
		return String.valueOf(this.aro);
	}
	
	public String cor() {
		return this.cor;
	}
	
	public String peso() {
		return String.valueOf(this.peso);
	}
	
	public String kmPedalado() {
		return String.valueOf(this.kmPedalado);
	}
	
	public boolean deletaBicicleta() {
		return true;
	}
}

