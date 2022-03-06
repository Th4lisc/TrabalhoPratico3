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
	public Usuario (String nome, String sobrenome, String email, Endereco endereco, Telefone telefone, int cpf, Plano plano, int kmPedalado) {
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
	public String nomecompleto() {
		return (this.nome + " " + this.sobrenome);
	}
	
	public String email() {
		return this.email;
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
