package tp3;

public class Endereco {

	// Atributos Endereco
	private long cep;
	private String pais;
	private String estado;
	private String bairro;
	private String ruaQuadra;
	private long numero;
		
	// Construtor
	public Endereco(long cep, String pais, String estado, String bairro, String ruaQuadra, long numero) {
		this.cep = cep;
		this.pais = pais;
		this.estado = estado;
		this.bairro = bairro;
		this.ruaQuadra = ruaQuadra;
		this.numero = numero;		
	}
	
	// Metodos
	public String cep() {
		return String.valueOf(this.cep);
	}
	
	public String pais() {
		return this.pais;
	}
	
	public String estado() {
		return this.estado;
	}
	
	public String bairro() {
		return this.bairro;
	}
	
	public String ruaQuadra() {
		return this.ruaQuadra;
	}
	
	public String numero() {
		return String.valueOf(this.numero);
	}
	
	public boolean editaEndereco(long cep, String pais, String estado, String bairro, String ruaQuadra, long numero) {
		this.cep = cep;
		this.pais = pais;
		this.estado = estado;
		this.bairro = bairro;
		this.ruaQuadra = ruaQuadra;
		this.numero = numero;
		
		return true;
	}
}
