package tp3;

import java.sql.Time;
import java.util.Date;

public class Corrida {

	// Atributos
	private int id;
	private Usuario usuario;
	private Time tempoUso;
	private Date dataUso;
	private Bicicleta bicicletaUtilizada;
	private int kmPedalado;
	
	// Construtor
	public Corrida(int id, Usuario usuario, Time tempoUso, Date dataUso, Bicicleta bicicletaUtilizada, int kmPedalado) {
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
		return String.valueOf(this.usuario);
	}
	
	public String tempoUso() {
		return String.valueOf(this.tempoUso);
	}
	
	public String dataUso() {
		return String.valueOf(this.dataUso);
	}
	
	public String bicicletaUtilizada() {
		return String.valueOf(this.bicicletaUtilizada);
	}
	
	public String kmPedalado() {
		return String.valueOf(this.kmPedalado);
	}
	
	public boolean addKmPedalado(float km) {
		this.kmPedalado += km;
		return true;
	}
	
	public boolean editaCorrida(int id, Usuario usuario, Time tempoUso, Date dataUso, Bicicleta bicicletaUtilizada, int kmPedalado) {
		this.id = id;
		this.usuario = usuario;
		this.tempoUso = tempoUso;
		this.dataUso = dataUso;
		this.bicicletaUtilizada = bicicletaUtilizada;
		this.kmPedalado = kmPedalado;
		
		return true;
	}
	
	
	
}
