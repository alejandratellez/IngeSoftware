package videojuego.ingesoft.utp;

import java.util.HashMap;
import java.util.Map;

public class Personaje {

	private Integer vida;

	private Integer escudo;

	private String apodo;

	private Arma codArma;

	private Map<Personaje, Integer> personajeDaño = new HashMap<>();

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

	public int recibirDaño(int daño, Personaje jugador) {

		Integer dañoAcumulado = personajeDaño.get(jugador) + daño;
		personajeDaño.put(jugador, dañoAcumulado);

		if (escudo != null && escudo > 0) {

			this.escudo -= daño;
		} else {

			this.vida -= daño;
		}

		return daño;
	}

	public int atacar(int daño, Personaje personaje) {

		personaje.recibirDaño(daño, personaje);
		return daño;

	}

	public int curarse(int cura) {
		// TODO - implementar

		return cura;
	}

}
