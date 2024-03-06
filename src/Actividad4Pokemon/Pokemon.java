package Actividad4Pokemon;

public class Pokemon {
//    Nombre del Pokemon: String
//    HealthPoints : int . Contiene los puntos de vida del Pokemon
//    FuerzaDeAtaque: int . La fuerza con la que un Pokemon ataca a otro Pokemon

	private String nombreP;
	private int healthpoint;
	private int fuerzaAtaque;

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	public int gethealthPoints() {
		return healthpoint;
	}

	public void setHealthPoints(int healthPoints) {
		healthpoint = healthPoints;
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
		healthpoint = healthPoints;
		this.fuerzaAtaque = fuerzaAtaque;

	}

	public boolean isDead() {

		if (this.healthpoint <= 0) {

			return true;
		} else {
			return false;
		}
	}

	public void atacar(Pokemon pokemon) {
		System.out.println(this.getNombreP() + " ATACA A: " + pokemon.getNombreP() + " CON: " + this.getFuerzaAtaque());

		pokemon.setHealthPoints(pokemon.gethealthPoints() - this.getFuerzaAtaque());

		System.out.println("LA VIDA DE: " + pokemon.getNombreP() + " ES DE " + pokemon.gethealthPoints());
	}

	@Override
	public String toString() {
		return "Pokemon [Nombre =" + getNombreP() + ", HealthPoints =" + gethealthPoints() + ", FuerzaDeAtaque ="
				+ getFuerzaAtaque() + "]";
	}

}
