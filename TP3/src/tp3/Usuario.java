package tp3;

public class Usuario {
	
	// Atributos usuario
	private int id;
	private String nome;
	private String sobrenome;
	private String email;
	private Endereco endereco;
	private Telefone telefone;
	private int cpf;
	private Plano plano;
	private int kmPedalado;
	
	// Construtor
	public Usuario (int id, String nome, String sobrenome, String email, Endereco endereco, Telefone telefone, int cpf, Plano plano, int kmPedalado) {
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
	public int id() {
		return id;
	}
	
	public String nomecompleto() {
		return (this.nome + " " + this.sobrenome);
	}
	
	public String email() {
		return this.email;
	}
	
	public String endereco() {
		return String.valueOf(this.endereco);
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
	
	public boolean editaUsuario(String nome, String sobrenome, String email, Endereco endereco, Telefone telefone, int cpf, Plano plano, int kmPedalado) {
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
