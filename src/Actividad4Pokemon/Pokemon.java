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

	public void setHealtPoints(int healtPoints) {
		healhtPoints = healtPoints;
	}

	public int getFuerzaAtaque() {
		return fuerzaAtaque;
	}

	public void setFuerzaAtaque(int fuerzaAtaque) {
		this.fuerzaAtaque = fuerzaAtaque;

	}

	public Pokemon(String nombreP, int healtPoints, int fuerzaAtaque) {
		super();
		this.nombreP = nombreP;
		healhtPoints = healtPoints;
		this.fuerzaAtaque = fuerzaAtaque;

	}

	public boolean isDead() {
		return healhtPoints == 0;
	}

	Pokemon[] pokemones = new Pokemon[5];

	public void atacar(Pokemon objetivo) {

		if (!isDead()) {
			System.out.println(nombreP + " [ATACA A] " + objetivo.nombreP);
		} else {
			System.out.println(nombreP + " no puede atacar, está muerto.");
		}
	}

}
