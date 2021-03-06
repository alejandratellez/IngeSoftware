package videojuego.ingesoft.utp;

import java.util.HashMap;
import java.util.Map;

public class Personaje {

	private Integer vida;

	private Integer escudo;

	private String apodo;

	private Arma codArma;

	private Map<Personaje, Integer> personajeDaņo = new HashMap<>();

	public Map<Personaje, Integer> getPersonajeDaņo() {
		return personajeDaņo;
	}

	public void setPersonajeDaņo(Map<Personaje, Integer> personajeDaņo) {
		this.personajeDaņo = personajeDaņo;
	}

	public Integer getEscudo() {
		return escudo;
	}

	public void setEscudo(Integer escudo) {
		this.escudo = escudo;
	}

	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public Arma getCodArma() {
		return codArma;
	}

	public void setCodArma(Arma codArma) {
		this.codArma = codArma;
	}

	public int recibirDaņo(int daņo, Personaje jugador) {

		Integer daņoAcumulado = personajeDaņo.get(jugador) + daņo;
		personajeDaņo.put(jugador, daņoAcumulado);

		if (escudo != null && escudo > 0) {

			this.escudo -= daņo;
		} else {

			this.vida -= daņo;
		}

		return daņo;
	}

	public int atacar(int daņo, Personaje personaje) {

		personaje.recibirDaņo(daņo, personaje);
		return daņo;

	}

	public int curarse(int cura) {
		// TODO - implementar

		return cura;
	}

}
