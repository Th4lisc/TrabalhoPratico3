package tp3;

public class Usuario {
	
	// Atributos usuario
	private long id;
	private String nome;
	private String sobrenome;
	private String email;
	private Endereco endereco;
	private Telefone telefone;
	private long cpf;
	private Plano plano;
	private long kmPedalado;
	
	// Construtor
	public Usuario (long id, String nome, String sobrenome, String email, Endereco endereco, Telefone telefone, long cpf, Plano plano, long kmPedalado) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.plano = plano;
		this.kmPedalado = kmPedalado;
	}
	
	// Metodos
	public String id() {
		return String.valueOf(this.id);
	}
	
	public String nomecompleto() {
		return (this.nome + " " + this.sobrenome);
	}
	
	public String email() {
		return this.email;
	}
	
	public String endereco() {
		return String.valueOf(this.endereco.pais() + ", " + this.endereco.estado() + ", " + this.endereco.bairro() + ", " + this.endereco.ruaQuadra() + ", " + this.endereco.numero() + " - " + this.endereco.cep());
	}
	
	public String telefone() {
		return telefone.ddd() + telefone.numero(); // Verificar
	}
	
	public String cpf() {
		return String.valueOf(this.cpf);
	}
	
	public String plano() {
		return plano.tipo();
	}
	
	public String kmPedalado() {
		return String.valueOf(this.kmPedalado);
	}
	
	public boolean addKmPedalado(float km) {
		this.kmPedalado += km;
		return true;
	}
	
	public boolean editaUsuario(String nome, String sobrenome, String email, Endereco endereco, Telefone telefone, long cpf, Plano plano, long kmPedalado) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.plano = plano;
		this.kmPedalado = kmPedalado;
		
		return true;
	}
	
	public boolean deletaUsuario() {
		
		return true;
	}
}
