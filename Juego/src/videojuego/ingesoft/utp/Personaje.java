package videojuego.ingesoft.utp;

import java.util.HashMap;
import java.util.Map;

public class Personaje {

	private Integer vida;

	private Integer escudo;

	private String apodo;

	private Arma codArma;

	private Map<Personaje, Integer> personajeDa�o = new HashMap<>();

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

	public int recibirDa�o(int da�o, Personaje jugador) {

		Integer da�oAcumulado = personajeDa�o.get(jugador) + da�o;
		personajeDa�o.put(jugador, da�oAcumulado);

		if (escudo != null && escudo > 0) {

			this.escudo -= da�o;
		} else {

			this.vida -= da�o;
		}

		return da�o;
	}

	public int atacar(int da�o, Personaje personaje) {

		personaje.recibirDa�o(da�o, personaje);
		return da�o;

	}

	public int curarse(int cura) {
		// TODO - implementar

		return cura;
	}

}
