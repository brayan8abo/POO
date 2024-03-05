package Actividad4Pokemon;

public class Pokemon {
//    Nombre del Pokemon: String
//    HealthPoints : int . Contiene los puntos de vida del Pokemon
//    FuerzaDeAtaque: int . La fuerza con la que un Pokemon ataca a otro Pokemon

	private String nombreP;
	private int healhtPoints;
	private int fuerzaAtaque;

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	public int gethealtPoints() {
		return healhtPoints;
	}

	public void setHealtPoints(int healthPoints) {
		healhtPoints = healthPoints;
	}

	public int getFuerzaAtaque() {
		return fuerzaAtaque;
	}

	public void setFuerzaAtaque(int fuerzaAtaque) {
		this.fuerzaAtaque = fuerzaAtaque;

	}

	public Pokemon(String nombreP, int healthPoints, int fuerzaAtaque) {
		super();
		this.nombreP = nombreP;
		healhtPoints = healthPoints;
		this.fuerzaAtaque = fuerzaAtaque;

	}

	public boolean isDead() {

		if (this.healhtPoints <= 0) {

			return true;
		} else {
			return false;
		}
	}

	public void atacar(Pokemon pokemon) {
		System.out.println(
				this.getNombreP() + " le hace un ataque a " + pokemon.getNombreP() + " de :" + this.getFuerzaAtaque());

		pokemon.setHealtPoints(pokemon.gethealtPoints() - this.getFuerzaAtaque());

		System.out.println(
				"La vida de de :" + pokemon.getNombreP() + " es de " + pokemon.gethealtPoints() + " puntos de vida");
	}
	
	@Override
	public String toString() {
		return "Pokemon [Nombre =" + getNombreP() + ", HealthPoints =" + gethealtPoints() + ", FuerzaDeAtaque ="
				+ getFuerzaAtaque() + "]";
	}

}
