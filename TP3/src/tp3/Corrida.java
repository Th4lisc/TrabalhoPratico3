package tp3;

import java.util.Date;

public class Corrida {

	// Atributos
	private long id;
	private Usuario usuario;
	private long tempoUso;
	private Date dataUso;
	private Bicicleta bicicletaUtilizada;
	private long kmPedalado;
	
	// Construtor
	public Corrida(long id, Usuario usuario, long tempoUso, Date dataUso, Bicicleta bicicletaUtilizada, long kmPedalado) {
		this.id = id;
		this.usuario = usuario;
		this.tempoUso = tempoUso;
		this.dataUso = dataUso;
		this.bicicletaUtilizada = bicicletaUtilizada;
		this.kmPedalado = kmPedalado;
	}
	
	// Metodos
	public String id() {
		return String.valueOf(this.id);
	}
	
	public String usuario() {
		return String.valueOf(this.usuario.nomecompleto());
	}
	
	public String tempoUso() {
		return String.valueOf(this.tempoUso);
	}
	
	public String dataUso() {
		return String.valueOf(this.dataUso);
	}
	
	public String bicicletaUtilizada() {
		return String.valueOf(this.bicicletaUtilizada.tipo());
	}
	
	public String kmPedalado() {
		return String.valueOf(this.kmPedalado);
	}
	
	public boolean addKmPedalado(float km) {
		this.kmPedalado += km;
		return true;
	}
	
	public boolean editaCorrida(long id, Usuario usuario, long tempoUso, Date dataUso, Bicicleta bicicletaUtilizada, long kmPedalado) {
		this.id = id;
		this.usuario = usuario;
		this.tempoUso = tempoUso;
		this.dataUso = dataUso;
		this.bicicletaUtilizada = bicicletaUtilizada;
		this.kmPedalado = kmPedalado;
		
		return true;
	}
	
	
	
}
