package tp3;

public class Estacao {
	
	// Atributos
	private int id;
	private String nome;
	private Endereco endereco;
	private int numVagas;
	private int numVagasDisponiveis;
	
	// Construtor
	public Estacao(String nome, Endereco endereco, int numVagas, int numVagasDisponiveis) {
		this.nome = nome;
		this.endereco = endereco;
		this.numVagas = numVagas;
		this.numVagasDisponiveis = numVagasDisponiveis;
	}
	
	// Metodos
	public String id() {
		return String.valueOf(this.id);
	}
	
	public String nome() {
		return this.nome;
	}
	
	public String endereco() {
		return String.valueOf(this.endereco);
	}
	
	public String numVagas() {
		return String.valueOf(this.numVagas);
	}
	
	public String numVagasDisponiveis() {
		return String.valueOf(this.numVagasDisponiveis);
	}
	
	public boolean editaEstacao(String nome, Endereco endereco, int numVagas, int numVagasDisponiveis) {
		this.nome = nome;
		this.endereco = endereco;
		this.numVagas = numVagas;
		this.numVagasDisponiveis = numVagasDisponiveis;
		
		return true;
	}
	
	public boolean editaEstacao(int numVagasDisponiveis) {
		this.numVagasDisponiveis = numVagasDisponiveis;
		
		return true;
	}
	
	public boolean deletaEstacao() {
		return true;
	}

}
